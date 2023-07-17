package ch14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 두개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
 * Hint. 배열을 사용하시오.
 */
public class Practice14_4 {
    public static void main(String[] args) {
        Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();

        dice.flatMap(i -> Stream.of(1, 2, 3, 4, 5, 6).map(i2 -> new int[]{i, i2})) // Stream<Integer> -> Stream<int[]>
                .filter(iArr -> iArr[0] + iArr[1] == 6)
                .forEach(iArr -> System.out.println(Arrays.toString(iArr)));
    }
}
