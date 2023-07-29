package ch15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Practice15_2
 * 지정된 이진파일의 내용을 실행결과와 같이 16진수로 보여주는 프로그램 작성
 */
public class HexaViewer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: java HexaViewer FILENAME");
            System.exit(0); // 프로그램 정상 종료
        }

        String inputFile = args[0];

        try {
            FileInputStream input = new FileInputStream(inputFile);
            PrintStream output = new PrintStream(System.out);

            int data = 0;
            int i = 0;

            // data를 16진수로 출력하려면 printf의 format옵션 중에서 '%x'를 사용해야 한다.
            // 빈자리를 0으로 채우는 2자리 16진수이어야 하므로 '%02x'가 된다.
            while ((data = input.read()) != -1) {
                output.printf("%02x ", data); // data를 두 자리의 16진수 형태로 출력한다.
                if (++i % 16 == 0)
                    output.println();
            }

            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // main
}
