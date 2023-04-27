package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2019/12/31)");

        // hasNextLine()은 다음에 읽을 값이 있는지 확인하는 boolean 타입의 메소드로 값이 있으면 true를 반환
        // 값이 없을 때 까지 반복문을 돈다.
        // 주의점 줄 단위의 구분자인 엔터("\n")도 hasNextLine()에서 읽어야할 값으로 판단
        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2019/12/31)");
            }
        } // while

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        System.out.println("입력하신 날짜는 현재와 "+day+"시간 차이가 있습니다.");
    } // main
}
