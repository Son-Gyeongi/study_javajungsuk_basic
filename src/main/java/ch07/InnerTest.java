package ch07;

class AAA { // AAA는 BBB의 외부클래스
    int i=100;
    BBB b = new BBB();

    class BBB { // BBB는 AAA의 내부클래스
        // AAA클래스에 있는 멤버변수 i를 사용해보자
        void method() {
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

//class BBB {
//    // AAA클래스에 있는 멤버변수 i를 사용해보자
//    void method() {
//        AAA a = new AAA();
//        System.out.println(a.i);
//    }
//}

class CCC {
//    BBB b = new BBB(); CCC는 AAA의 내부 클래스인 BBB에 접근 불가능
}

public class InnerTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method();
        AAA a = new AAA();
        a.b.method();
    }
}
