package ch10;

import java.text.DecimalFormat;

// format을 바꾸는 예제
public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##"); // DecimalFormat 생성할 떄 원하는 패턴 적으면 된다.
        DecimalFormat df2 = new DecimalFormat("#.###E0"); // 지수형식

        try {
            Number num = df.parse("1,234,567,.89"); // 형식 문자열에서 숫자로 바꿀떄는 parse()메서드 쓴다.
            System.out.print("1,234,567,.89" + " -> ");

            // 처음에는 문자열("1,234,567,.89")이었는데 parse메서드를 이용해서 double 타입으로 바꿨다.
            double d = num.doubleValue(); // d=1234567.89
            System.out.print(d + " -> ");

            System.out.println(df2.format(num)); // 숫자를 형식 문자열로 바꿀 떄는 format()메서드를 쓴다.
        } catch (Exception e) {}
    } // main
}
/**
 * 결과
 * 1,234,567,.89 -> 1234567.89 -> 1.235E6
 * 문자열을 숫자로 바꿨다가 다시 다른 형식의 문자열로 바꿨다.
 */
