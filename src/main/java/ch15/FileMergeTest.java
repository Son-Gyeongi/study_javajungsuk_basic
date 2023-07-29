package ch15;

import java.io.*;
import java.util.Vector;

/**
 * Practice15_3
 * 커맨드라인으로 부터 여러 파일의 이름을 입력받고,
 * 이 파일들을 순서재로 합쳐서 새로운 파일을 만들어 내는 프로그램 작성
 * 단, 합칠 파일의 개수에는 제한을 두지 않는다.
 *
 * 여러 개의 파일을 하나로 연결하기 위해서는 SequenceInputStream이 적합
 * SequenceInputStream은 여러 Stream을 하나의 Stream처럼 다룰 수 있다.
 */
public class FileMergeTest {
    public static void main(String[] args) {
        /**
         * 사용자로부터 입력받은 값은 항상 유효성체크를 해주어야한다.
         * 입력받은 파일이 존재하지 않을수도 있기 때문이다.
         */
        if (args.length < 2) { // 입력값이 2보다 작으면, 메세지를 출력하고 종료한다.
            System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ...");
            System.exit(0); // 프로그램 정상 종료
        }

        /**
         * 커맨드라인으로 입력받은 파일을 Vector에 저장하고,
         * 이 Vector로 SequenceInputStream을 생성한 다음에 읽고 쓰면 끝이다.
         * 사용자로부터 입력받은 값은 항상 유효성체크를 해주어야한다.
         * 입력받은 파일이 존재하지 않을수도 있기 때문이다.
         */
        try {
            Vector v = new Vector();

            for (int i = 1; i < args.length; i++) {
                File f = new File(args[i]);

                if (f.exists()) {
                    v.add(new FileInputStream(args[i]));
                } else {
                    System.out.println(args[i] + " - 존재하지 않는 파일입니다.");
                    System.exit(0); // 프로그램 정상 종료
                }
            }

            SequenceInputStream input = new SequenceInputStream(v.elements());
            FileOutputStream output = new FileOutputStream(args[0]);

            int data = 0;

            while ((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } // main
}
