package ch14;

import java.util.Random;

/**
 * 임의의 로또번호(1~45)를 정렬해서 6개 출력하시오.
 */
public class Practice14_7 {
    public static void main(String[] args) {
        // 난수스트림 반환 / Random클래스 객체를 만들고 ints()호출
//        IntStream intStream = new Random().ints(); // 무한스트림
//        intStream.limit(6).forEach(System.out::println);

        new Random().ints(1,46) // 1~45사이의 정수(46은 포함안됨)
                .distinct() // 중복제거
                .limit(6)// 6개만
                .sorted() // 정렬
                .forEach(System.out::println); // 화면에 출력
    }
}

/**
 * Random클래스의 ints()는 지정된 범위 내의 임의의 정수를 요소로 하는 무한 스트림을 반환한다.
 * 무한스트림이므로 limit()이 필요하다. sorted()로 정렬한 다음, forEach()로 화면에 출력한다.
 */
