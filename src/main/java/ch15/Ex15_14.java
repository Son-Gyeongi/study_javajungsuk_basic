package ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 표준 입출력의 대상변경 예제
 * System.out의 출력소스를 test.txt파일로 변경하였기 때문에
 * System.out을 이용한 출력은 모두 test.txt파일에 저장된다.
 * 그래서 실행결과에는 System.err를 이용한 출력만 나타난다.
 */
public class Ex15_14 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps); // System.out의 출력대상을 test.txt파일로 변경
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
