package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

/* 스트림의 중간연산 -
    flatMap() : 스트림의 스트림을 스트림으로 변환할 때 사용 */
public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

//        Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        // flatMap() : 문자열 배열을 하나의 스트림으로 합치기
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase) // 스트릠의 요소를 모두 소문자로 변경
                .distinct() // 중복 제거
                .sorted() // 정렬
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // 단어 하나하나 스트림의 요소로 만들기
//                .peek(line -> System.out.println("line = " + line)) // 중간 작업 결과 확인
                .map(String::toLowerCase) // 소문자로 변환
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
