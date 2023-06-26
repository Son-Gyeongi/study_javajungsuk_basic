package ch12;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override // 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
    @Deprecated // 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
    void parentMethod() {} // 조상의 메서드의 이름을 잘못 적었음
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
    void test(); // 추상 메서드
//    void check(); // 추상 메서드
}

public class Ex12_7 {
    @SuppressWarnings("deprecation") // 컴파일러가 보여주는 경고메시지가 나타나지 않게 억제 해준다.
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated된 메서드 사용
    }
}
