package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

// Predicate의 결합
public class Ex14_3 {
    public static void main(String[] args) {
        /* 자바의 정석 3판 */
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // 16진수로 해석해서 숫자를 바꿔라.
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i); // 2진수 문자열로 바꿔준다.

        // 람다식을 하나로 연결할 수 있다.
        Function<String, String> h = f.andThen(g); // andThen : f를 적용하고 나서 g를 적용해라
        Function<Integer, Integer> h2 = f.compose(g); // g.andThen(f) 와 같다.

        System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String, String> f2 = x -> x; // 항등 함수(identity function)
        System.out.println(f2.apply("AAA")); // AAA가 그대로 출력됨

        /* 자바의 정석 기초편 */
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        // i >= 100 && (i < 200 || i % 2 == 0)
        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150)); // true

        String str1 = "abc";
        String str2 = "abc";

        // str1과 str2가 같은지 비교한 결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        // boolean result = Predicate.isEqual(str1).test(str2); 와 같다.
        // boolean result = str1.equals(str2); 와 같다.
        System.out.println(result);
    }
}
