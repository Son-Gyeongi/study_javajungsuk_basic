package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 지정된 날짜범위에 21일이 몇 번 포함되는지 계산
public class Practice10_3_answer {
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
//        1. from 또는 to가 null이면 0을 반환한다.
        if (from == null || to == null) return 0;

//        2. from와 to가 같고 날짜가 21일이면 1을 반환한다.
        if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
            return 1;
        }

        int fromYear = from.get(Calendar.YEAR);
        int fromMon = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DAY_OF_MONTH);

        int toYear = to.get(Calendar.YEAR);
        int toMon = to.get(Calendar.MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);

//        3. to와 from이 몇 개월 차이인지 계산해서 변수 monDiff에 담는다.
        int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);

//        4. monDiff가 음수이면 0을 반환한다.
        if (monDiff < 0) return 0;

//        5. 만일 from의 일(DAY_OF_MONTH)이 21일이거나 이전이고
//         to의 일(DAY_OF_MONTH)이 21일이거나 이후이면 monDiff의 값을 1 증가시킨다.
        if (fromDay <= 21 && toDay >= 21)
            monDiff++;

//        6. 만일 from의 일(DAY_OF_MONTH)이 21일 이후고
//         to의 일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1 감소시킨다.
        if (fromDay > 21 && toDay < 21)
            monDiff--;

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

        fromCal.set(2021, 0, 22); // 2021년 1월 22일
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);
    }
}
