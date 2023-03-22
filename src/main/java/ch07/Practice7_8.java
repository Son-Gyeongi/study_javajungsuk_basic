package ch07;
/*
외부 클래스와 내부 클래스에 같은 이름의 인스턴스 변수(value)가 선언되었을 때 어떻게 구별하는가에 대한 문제
외부 클래스의 인스턴스 변수는 내부 클래스에서 '외부클래스이름.this.변수이름'으로 접근할 수 있다.
내부 클래스의 종류가 인스턴스 클래스이기 때문에 외부 클래스의 인스턴스를 생성한 다음에야 내부 클래스의 인스턴스를 생성할 수 있다.
 */

class Outer3 {
    int value = 10;

    class Inner3 {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value);
        }
    } // Inner클래스의 끝
} // Outer 클래스의 끝

public class Practice7_8 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner3 inner = o.new Inner3();
        inner.method1();
    }
}
