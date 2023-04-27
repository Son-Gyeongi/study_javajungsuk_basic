package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice10_2 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat date = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
        Date inDate = null; // 입력받은 문자열 값을 날짜값으로 변경할 때 저장하는 변수
        Scanner s = new Scanner(System.in);

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2023/04/27)");
        System.out.print(">>");

        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.
                System.out.println(date.format(inDate));
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2023/04/27)");
                System.out.print(">>");
            }
        }
    }
}
