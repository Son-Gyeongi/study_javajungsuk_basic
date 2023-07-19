package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
InputStream과 OutputStream 예제1
- ByteArrayInputStream / ByteArrayOutputStream은 메모리,
즉 바이트배열에 데이터를 입출력 하는데 사용되는 스트림이다.
 */
public class Ex15_1 {
    public static void main(String[] args) {
        byte[] inSrc = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;

        while ((data = input.read()) != -1) // 더이상 읽어올 데이터가 없을 때 -1을 반환
            output.write(data); // void write(int b)

        outSrc = output.toByteArray(); // 스트림의 내용을 byte배열로 반환한다.

        System.out.println("Input Source :" + Arrays.toString(inSrc));
        System.out.println("Output Source :" + Arrays.toString(outSrc));
    }
}
