package ch09;

public class Ex9_13_RoundTest {
    public static void main(String[] args) {
        // 반복문으로 2.0까지 0.1씩 증가시키자
//        for (double d = 0.0; d <= 2.0; d += 0.1) {
//            double d1 = Math.round(d); // 반올림
//            double d2 = Math.rint(d);
//
//            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
//        }

        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        // 값이 0.5인경우 테스트
        for (double d = 1.5; d <= 10.5; d++) {
            double d1 = Math.round(d); // 반올림
            double d2 = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;
        }
        System.out.println("----------------");
        System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);

        /**
         * 결과
         *  1.5  2.0  2.0
         *  2.5  3.0  2.0
         *  3.5  4.0  4.0
         *  4.5  5.0  4.0
         *  5.5  6.0  6.0
         *  6.5  7.0  6.0
         *  7.5  8.0  8.0
         *  8.5  9.0  8.0
         *  9.5 10.0 10.0
         * 10.5 11.0 10.0
         * ------------------------
         * 60.0 65.0 60.0
         * 주어진 값 더하기 / round() 값 더하기 / rint() 값 더하기
         *
         * 결과를 보면 주어진 값 더한것과 비교해보면
         * round() 더한 값보다 rint() 더한 값이 더 정확하다.
         *
         * round()로 더하면 무조건 올림이라서 오차가 커진다.
         * 그래서 나온게 roundeven인 rint()이다.
         */
    }
}
