package ch14;

import java.util.Optional;
import java.util.OptionalInt;

/* Optional<T> */
public class Ex14_8 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde"); // "abcde"라는 값 가지고 있는 Optional객체 만들었다.
//        Optional<Integer> optInt = optStr.map(String::length); // optStr을 length로 변환. 메서드 참조
        Optional<Integer> optInt = optStr.map(s -> s.length()); // optStr을 length로 변환. 람다식
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123") // "123"라는 값 가지고 있는 Optional객체 만들었다.
                .filter(x -> x.length() > 0) // 문자열의 길이가 0보다 큰지 확인
                .map(Integer::parseInt).get(); // parseInt를 이용해서 문자열을 숫자로 바꾼다. -> 123 / get()은 값 꺼내기

        int result2 = Optional.of("") // 빈문자열
                .filter(x -> x.length() > 0) // false. 조건에 맞는 요소가 없다. null
                .map(Integer::parseInt).orElse(-1); // map(Integer::parseInt) 값은 null이다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt) // Optional의 값 "456"을 숫자 456으로 바꾸기
                .ifPresent(x -> System.out.printf("result3 = %d%n", x)); // ifPresent() null이 아니면 괄호안에 실행

        OptionalInt optInt1 = OptionalInt.of(0);// 0을 저장. 값 0. isPresent: true
        OptionalInt optInt2 = OptionalInt.empty();// 빈 객체를 생성. 값 0. isPresent: false

        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false

        System.out.println(optInt1.getAsInt()); // 0
//        System.out.println(optInt2.getAsInt()); // NoSuchElementException
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);
        System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));
    }
}
