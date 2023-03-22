package ch07;

class Outer1 {
    class Inner1 {
        int iv = 100;
    }
}

public class Practice7_6_answer {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner1 oi = o.new Inner1();
        System.out.println(oi.iv);

        /*
        해설
        내부 클래스(인스턴스 클래스)의 인스턴스를 생성하기 위해서는 먼저 외부클래스의 인스턴스를 생성해야한다.
        왜냐하면 '인스턴스 클래스'는 외부 클래스의 '인스턴스 변수'처럼
        외부 클래스의 인스턴스가 생성되어야 쓸 수 있기 때문이다.

         */
    }
}
