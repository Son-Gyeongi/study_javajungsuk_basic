package ch07;

class Point2 { // extends Object가 생략되어 있다.
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString()을 오버라이딩
    // public을 붙인건 Object클래스의 toString()메서드의 선언부와 똑같아야한다.
    public String toString() {
        return "x : "+ x + ", y : "+ y;
    }
}

public class OverrideTest2 {
    public static void main(String[] args) {
//        Point2 p = new Point2();
//        p.x = 3;
//        p.y = 5;
        // 간단히
        Point2 p = new Point2(3,5); // 생성자 필요

//        System.out.println("p.x="+p.x);
//        System.out.println("p.y="+p.y);
        // 간단히
//        System.out.println(p.toString());
        // 더 간단히
        System.out.println(p);
    }
}
