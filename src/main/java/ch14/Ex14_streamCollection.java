package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_streamCollection {
    public static void main(String[] args) {
        /* 스트림 만들기 - 컬렉션 */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 가변인자
        Stream<Integer> intStream = list.stream(); // list를 소스로 하는 스트림 생성
        intStream.forEach(System.out::print); // 스트림의 모든 요소를 출력한다. forEach() 최종연산
//        intStream.forEach(System.out::println); // 에러. 스트림이 이미 닫혔다.
        // 해결. 다시 스트림을 만든다
        // stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
        intStream = list.stream(); // list를 소스로 하는 스트림 생성
        intStream.forEach(System.out::print);
        System.out.println();
    }
}
