package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2023년 4월 27일"); // parse()메서드를 사용해서 문자열을 날짜로 바꾼다.
            System.out.println(df2.format(d)); // format()메서드를 사용해서 날짜를 문자열로 바꾼다.
        } catch (Exception e) {}
    } // main
}
