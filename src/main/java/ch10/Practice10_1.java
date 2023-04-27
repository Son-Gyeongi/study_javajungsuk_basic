package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice10_1 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date.set(2019, 11, 1);

        for (int i = 0; i < 12; i++) {
            date.add(Calendar.MONTH, 1);
            System.out.println(sdf.format(new Date(date.getTimeInMillis()))+"은 2번째 일요일입니다.");
        }
    }
}
