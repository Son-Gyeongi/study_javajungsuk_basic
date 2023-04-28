package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice10_3 {
    static int paycheckCount(Calendar from, Calendar to) {
        /**
         * 아래의 로직에 맞게 코드를 작성하시오.
         * 1. from 또는 to가 null이면 0을 반환한다.
         * 2. from와 to가 같고 날짜가 21일이면 1을 반환한다.
         * 3. to와 from이 몇 개월 차이인지 계산해서 변수 monDiff에 담는다.
         * 4. monDiff가 음수이면 0을 반환한다.
         * 5. 만일 from의 일(DAY_OF_MONTH)이 21일이거나 이전이고
         *    to의 일(DAY_OF_MONTH)이 21일이거나 이후이면 monDiff의 값을 1 증가시킨다.
         * 6. 만일 from의 일(DAY_OF_MONTH)이 21일 이후고
         *    to의 일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1 감소시킨다.
         */

        int monDiff = 0;

        if (from == null || to == null) {
            return monDiff;
        } else if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
            monDiff = 1;
        }

        // from과 to가 몇 개월 차이인지 계산
//        monDiff = (int) (to.getTimeInMillis() - from.getTimeInMillis()) / (24 * 60 * 60 * 1000*12);

//        if (monDiff < 0) {
//            return monDiff;
//        } else {
//            for ()
//        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020, 0, 1); // 2020년 1월 1일
        toCal.set(2020, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 21); // 2020년 1월 21일
        toCal.set(2020, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 23); // 2020년 1월 23일
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2021, 0, 22); // 2020년 1월 22일
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);
    }
}
