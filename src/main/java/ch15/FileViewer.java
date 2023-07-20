package ch15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
// Ex15_4
FileInputStream과 FileOutputStream 예제1
 */
public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        /**
         * 인텔리제이에서는 윗 줄 대신 아래 줄 입력하고 run으로 실행
         * FileInputStream fis = new FileInputStream("src/main/java/ch15/FileViewer.java");
         */

        int data = 0;

        // 주석 한글 인코딩
        InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while ((data = bufferedReader.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }
    }
}
