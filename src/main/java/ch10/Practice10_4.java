package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하기
public class Practice10_4 {
    public static void main(String[] args) throws ParseException {
        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);

        Scanner s = new Scanner(System.in);
        Date inDate = null; // birth day, 입력받은 문자열 값을 날짜값으로 변경할 때 저장하는 변수
        inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.

        Calendar birth = Calendar.getInstance();
        birth.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long diffDay = (today.getTimeInMillis() - birth.getTimeInMillis()) / (24 * 60 * 60 * 1000);

//        Date today = new Date();
//        long diffDay = (today.getTime() - inDate.getTime()) / (24 * 60 * 60 * 1000);

        System.out.println("birth day="+df.format(inDate));
        // Calendar타입을 쓸 때 형식 변경하려면 Date타입으로 변경 후 가능
        System.out.println("today ="+df.format(new Date(today.getTimeInMillis())));
//        System.out.println("today ="+df.format(today));
        System.out.println(diffDay+" days");
    }
}
