package ch07;

class A {
    // B의 메서드를 호출하는 method
    public void method(C b) {
        b.method();
    }
}

class B {
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C {
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); // A가 B를 사용 (의존)
    }
}
