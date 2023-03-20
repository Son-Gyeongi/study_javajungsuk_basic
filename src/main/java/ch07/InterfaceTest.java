package ch07;

class A {
    // B의 메서드를 호출하는 method
    public void method(I i) { // 인터페이스 I를 구현한 놈들만 들어와라
        i.method();
    }
}

// B클래스의 선언과 구현을 분리

interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I {
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
