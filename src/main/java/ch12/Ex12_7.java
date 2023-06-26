package ch12;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override // 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
    @Deprecated // 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
    void parentMethod() {} // 조상의 메서드의 이름을 잘못 적었음
}

public class Ex12_7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated된 메서드 사용
    }
}
