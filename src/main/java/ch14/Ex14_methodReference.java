package ch14;

import java.util.function.Function;
// java.util.function - 자바에서 제공하는 함수형 인터페이스 모아놓은 거

public class Ex14_methodReference {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        // 람다식을 메서드 참조로 바꾸기
//        Function<String, Integer> f = 클래스이름::메서드이름;
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100")+200);
    }
}
