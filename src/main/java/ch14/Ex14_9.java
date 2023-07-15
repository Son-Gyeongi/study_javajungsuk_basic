package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 스트림의 최종연산 - reduce() */
public class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel() // 병렬로 처리
                .forEach(System.out::println);
//                .forEachOrdered(System.out::println); // parallel() 병렬처리해도 요소 순서유지

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
                .parallel() // 병렬로 처리
                .filter(s -> s.charAt(0) == 's')
                .findAny();
//                .findFirst();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

        // Stream<String>을 Stream<Integer>로 변환
        Stream<Integer> intStream = Stream.of(strArr).map(String::length);

        // Stream<String>을 IntStream으로 변환 / mapToInt()를 쓰면 기본형 스트림으로 바꿔준다. IntStream은 기본형 스트림
        // Stream<Integer>와 IntStream 같은 거지만 성능 때문에 IntStream을 쓴다. IntStream가 성능이 더 빠르다.
        // Stream<Integer>는 각 요소를 객체로 다룬다. IntStream은 각 요소를 기본형으로 다룬다.
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.getAsInt());
    }
}
