package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Practice14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        // 스트림 만들기
        Stream<String> strStream = Stream.of(strArr);

        strStream.map(String::length) // strStream.map(s->s.length()) // Stream<String> -> Stream<Integer>
                .sorted(Comparator.reverseOrder()) // 문자열 길이로 역순 정렬
                .limit(1).forEach(System.out::println); // 제일 긴 문자열의 길이 출력

        // 가장 긴 문자열 자체를 출력 / dddd가 출력됨
//        strStream.sorted(Comparator.comparingInt(String::length).reversed())
//                .limit(1).forEach(System.out::println);
    }
}
