package ch07;

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}
public class Practice7_7_answer {
    public static void main(String[] args) {
        Outer2.Inner2 oi = new Outer2.Inner2();
        System.out.println(oi.iv);

        /*
        해설
        스태틱 클래스(static inner class)는 인스턴스 클래스와 달리
        외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다.
        마치 static 멤버를 인스턴스 생성없이 사용할 수 있는 것처럼
         */
    }
}
