package ch14;

import java.util.Optional;

// Optional<T>객체의 값 가져오기 - get(), orElse(), orElseGet(), orElseThrow()
public class Ex14_Optional {
    public static void main(String[] args) {
        /* 초기화 */
//        int[] arr = {}; // arr.length -> 0
//        int[] arr = null; // arr.length -> NullPointerException
        int[] arr = new int[0]; // arr.length -> 0
        System.out.println("arr.length = " + arr.length);

        // Optional객체 만들기 - 초기화
//        Optional<String> opt = null; // OK. 하지만 바람직하지 않다.
        Optional<String> opt = Optional.empty(); // OK. 비어있다.
//        Optional<String> opt = Optional.of("abc"); // 값이 "abc"인 Optional객체 만들어진다.
        System.out.println("opt = " + opt);
        /**
         * get() : Optional객체에서 값 꺼내기
         * 값이 없으면 NoSuchElementException 에러난다. 그래서 예외 처리해줘야 한다.
         */
//        System.out.println("opt = " + opt.get());

        String str = ""; // 빈문자열
//        try {
//            str = opt.get(); // 예외발생
//        } catch (Exception e) {
//            str = ""; // 예외가 발생하면 빈문자열("")로 초기화
//        }
        // 번거롭다. 아래와 같이 바꾸자
//        str = opt.orElse("EMPTY"); // Optional에 저장된 값이 null 이면 "EMPTY" 반환. null인지 아닌지 확인 가능
//        str = opt.orElseGet(() -> "EMPTY"); // 괄호에 람다식 쓸 수 있다.
//        str = opt.orElseGet(() -> new String());
        str = opt.orElseGet(String::new); // 메서드 참조
        // orElse(), orElseGet() 결과는 같아보여도 람다식이 더 활용도가 높다.
        System.out.println("str = " + str);
    }
}
