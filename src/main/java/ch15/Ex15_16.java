package ch15;

import java.io.File;

// File 예제2
// 지정한 디렉토리(폴더)에 포함된 파일과 디렉토리의 목록을 보여 주는 예제이다.
public class Ex15_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE : java Ex15_16 DIRECTORY");
            System.exit(0); // 프로그램 정상 종료
        }

        File f = new File(args[0]);

        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0); // 프로그램 정상 종료
        }

        File[] files = f.listFiles();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(
                    files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    } // main
}
