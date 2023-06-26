package ch12;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
//    @Override // 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
//    void parentmethod() {} // 조상의 메서드의 이름을 잘못 적었음
}

public class Ex12_7 {
    public static void main(String[] args) {

    }
}
