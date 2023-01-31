package ch06;

class MyPoint {
    int x;
    int y;

    MyPoint() {} // 기본생성자

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        double line1 = Math.pow(x1-x, 2); // x1-x의제곱
        double line2 = Math.pow(y1-y, 2); // y1-y의제곱
        return Math.sqrt(line1+line2);
    }
}

public class Practice6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
