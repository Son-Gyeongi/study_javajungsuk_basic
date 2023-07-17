package ch14;

import java.util.stream.Stream;

/**
 * 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.
 */
public class Practice14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        // 스트림 만들기
        Stream<String> strStream = Stream.of(strArr);

//        int sum = strStream.mapToInt(s -> s.length()).sum();
        int sum = strStream.mapToInt(String::length)
//                .peek(s-> System.out.println("s = " + s)) // 중간 출력
                .sum();
        System.out.println("sum = " + sum);
    }
}
