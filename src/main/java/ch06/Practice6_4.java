package ch06;

// 문제 6_4
public class Practice6_4 {
    static double getDistance(int x, int y, int x1, int y1) {
        double line1 = Math.pow(x1-x, 2); // x1-x의제곱
        double line2 = Math.pow(y1-y, 2); // y1-y의제곱
        return Math.sqrt(line1+line2);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
