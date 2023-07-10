package ch14;

import java.util.stream.Stream;

public class Ex14_streamLambda {
    public static void main(String[] args) {
        /* 스트림 만들기 - 람다식 iterate(), generate() // 무한스트림 */
        // iterate(T seed, UnaryOperator<T> f)를 이용해서 짝수 스트림 만들기
        // UnaryOperator : 단항 연산자, 1개를 넣으면 결과가 1개 나온다.
        Stream<Integer> intStream = Stream.iterate(2, n -> n + 2); // 초기값, 람다식
        intStream
                .limit(10) // 10개만 자르기
                .forEach(System.out::println);

        // generate(Supplier s)를 이용 : 공급자가 매개변수로 주기만하고 입력이 없고 출력만 있다.
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream
                .limit(10) // 10개만 자르기
                .forEach(System.out::println);

    }
}
