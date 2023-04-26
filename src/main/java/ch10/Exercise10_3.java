package ch10;

import java.util.Calendar;

public class Exercise10_3 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int diff = 0;
        try {
            int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
            int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1;
            int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
            int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
            int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
            int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
            // 2개의 Calendar 객체를 만들 때 약간의 ms 차이가 난다.
            // 그래서 이 부분을 해결하기 위해서 clear()를 쓰자
            date1.clear();
            date2.clear();
            // 특정시간이 필요한게 아니라면 전체 필드 클리어 후 세팅하자
            date1.set(year1, month1, day1);
            date2.set(year2, month2, day2);
            // 24 * 60 *60 * 1000 일단위로 나오게 하기 위해서
            diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()))/(24 * 60 *60 * 1000);
        } catch (Exception e) {
            diff = 0; // subString(), parseInt()에서 예회가 발생하면 0을 반환한다.
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));

        /**
         * 결과
         * 1 (2가 나올 줄 알았는데 1이 나왔다.) 그이유는 Calendar객체 생성 후 클리어를 안해줘서이다.
         * 0
         * 0
         *
         * => clear()메서드를 써서 날짜시간 초기화를 해주면 해결된다.
         * date1.clear();
         * date2.clear();
         * 2
         * 0
         * 0
         */
    }
}
