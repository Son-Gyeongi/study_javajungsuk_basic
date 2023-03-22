package ch07;

public class Ex7_12 {
    class InstanceInner { // 인스턴스 내부 클래스
        int iv = 100;
//        static int cv = 100; 에러! static변수를 선언할 수 없다.
//        인스턴스 내부 클래스는 static 멤버를 가질 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용
    }

    static class StaticInner { // static 내부 클래스
        int iv = 200;
        static int cv = 200; // static클래스만 static멤버를 정의할 수 있다.
        // static멤버 - 객체 생성없이 사용가능
    }

    void myMethod() { // 지역 내부 클래스
        class LocalInner {
            int iv = 300;
//            static int cv = 300; 에러! static변수를 선언할 수 없다.
//            지역 내부 클래스도 static멤버 가질 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
