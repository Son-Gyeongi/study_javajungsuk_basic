package ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_streamRandom {
    public static void main(String[] args) {
        /* 스트림 만들기 - 임의의 수(난수) */
//        IntStream intStream = new Random().ints(); // 무한스트림
//        IntStream intStream = new Random().ints(5); // 무한스트림(개수 지정)
        // 무한스트림(범위 지정) 5<=i<10
//        IntStream intStream = new Random().ints(5, 10);
        // 무한스트림(개수, 범위 지정) 5<=i<10
        IntStream intStream = new Random().ints(10,5, 10);
        intStream
//                .limit(10) // 10개만 자르기
                .forEach(System.out::println);
    }
}
