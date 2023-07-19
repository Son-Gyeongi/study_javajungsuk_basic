package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
InputStream과 OutputStream 예제2
- 바구니(배열 temp)를 이용하면 한 번에 더 많은 물건을 옮길 수 있는 것과 같다고 이해하면 좋다.
- 배열을 이용한 입출력은 작업의 효율을 증가시키므로 가능하면 입출력 대상에 따라 알맞은 크기의 배열을 사용하는 것이 좋다.
 */
public class Ex15_2 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length); // 읽어 온 데이터를 배열 temp에 담는다. temp배열에 0번째 인덱스 부터 temp길이만큼 inSrc를 받아온다.
        output.write(temp, 5, 5); // temp[5]부터 5개의 데이터를 write한다.

        outSrc = output.toByteArray();

        System.out.println("Input Source :" + Arrays.toString(inSrc));
        System.out.println("temp :" + Arrays.toString(temp));
        System.out.println("Output Source :" + Arrays.toString(outSrc));
    }
}
