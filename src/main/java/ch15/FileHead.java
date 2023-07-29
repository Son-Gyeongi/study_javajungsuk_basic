package ch15;

import java.io.*;

/**
 * Practice15_1
 * 커맨드라인으로 부터 파일명과 숫자를 입력받아서, 입력받은 파일의 내용의 처음부터 받은
 * 숫자만큼의 라인을 출력하는 프로그램을 작성.
 * 파일을 라인단위로 읽기 위해 BufferedReader의 readLine()을 사용
 */
public class FileHead {
    public static void main(String[] args) {
        try {
            int lineNum = Integer.parseInt(args[0]);
            String fileName = args[1];

            File f = new File(fileName);

            // 사용자로 부터 입력받은 이름의 파일이 존재하는지, 디렉토리는 아닌지 확인
            if (f.exists() && !f.isDirectory()) {
                BufferedReader br = new BufferedReader(new FileReader(fileName));

                String line = "";
                int i = 1;

                // 입력받은 라인 수 만큼만 파일의 내용을 라인화면에 출력
                // readLine()은 더이상 읽을 라인이 없으면 null을 반환
                while ((line = br.readLine()) != null && i <= lineNum) {
                    System.out.println(i + ":" + line);
                    i++;
                }
            } else {
                throw new FileNotFoundException(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("USAGE: java FileHead 10 FILENAME");
        }
    } // main
}
