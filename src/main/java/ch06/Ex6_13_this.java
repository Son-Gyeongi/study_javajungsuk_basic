package ch06;

class MyMath13 {
    long a, b; // this.a, this.b  iv의 진짜이름

    MyMath13(int a, int b) { // 생성자
        this.a = a;
        this.b = b;
    }
    long add() { // 인스턴스 메서드
        return a+b; // return this.a+this.b;
    }
    static long add(long a, long b) { // 클래스 메서드(static메서드)
        return a+b;
    }
}

public class Ex6_13_this {
    public static void main(String[] args) {

    }
}
