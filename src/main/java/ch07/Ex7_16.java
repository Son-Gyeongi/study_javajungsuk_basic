package ch07;

class Outer7_16 {
    int value = 10; // Outer7_16.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("               value : " + value);
            System.out.println("          this.value : " + this.value);
            System.out.println("Outer7_16.this.value : " + Outer7_16.this.value);
        }
    } // Inner클래스의 끝
} // Outer7_16클래스의 끝

public class Ex7_16 {
    public static void main(String[] args) {
        Outer7_16 outer = new Outer7_16();
        Outer7_16.Inner inner = outer.new Inner();
        inner.method1();
    }
}
