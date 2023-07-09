package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
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

        /* 스트림 만들기 - 배열 */
//        Stream<String> strStream = Stream.of("a", "b", "c"); // 가변인자
        String[] strArr = new String[]{"a", "b", "c", "d"}; // 배열
//        Stream<String> strStream = Stream.of(strArr);
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        // int, long, double 기본형 배열을 소스로 하는 스트림 생성
        // 기본형일 때는 IntStream를 쓰는 게 좋다. - count(), sum(), average() 숫자에 관려된 메서드들이 있다.
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);
//        System.out.println("intStream1 count= "+intStream1.count()); // 최종연산
//        System.out.println("intStream1 sum= "+intStream1.sum());
        System.out.println("intStream1 average= "+intStream1.average());

        Integer[] intArr2 = {1, 2, 3, 4, 5}; // 자동으로 오토박싱이되서 Integer객체 배열이 된다. 1 -> new Integer(1)
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
//        intStream2.forEach(System.out::println);
        // Stream<Integer> Integer객체 스트림은 count()밖에 없다.
        // Stream<T>는 숫자 외에도 여러 타입의 스트림이 가능해야 하므로 숫자 스트림에만 사용할 수 있는
        // sum(), average()를 넣지 않았다.
        System.out.println("intStream2 count= "+intStream2.count()); // 스트림의 요소가 몇 개인지 반환
    }
}
