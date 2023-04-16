package ch08;

public class Practice8_3Test {
    class NumberException extends Exception {}
    class InvalidNumberException extends NumberException {}
    class NotANumberException extends NumberException {}

    class Parent {
        int a;
        int b;

        Parent() {
            this(0, 0);
        }

        Parent(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void add(int a, int b) throws InvalidNumberException, NotANumberException {}
    }

    class Child extends Parent {
        Child() {}

        Child(int a, int b) {
            super(a,b);
        }

        // 메서드 오버라이딩 테스트
        // 오버라이딩 할 때, 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
        // 예외의 개수는 적거나 같아야 한다.
        void add(int a, int b) throws InvalidNumberException, NotANumberException {} // 오버라이딩 가능
//        void add(int a, int b) throws InvalidNumberException {} // 오버라이딩 가능
//        void add(int a, int b) throws NotANumberException {} // 오버라이딩 가능
        // 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
//        void add(int a, int b) throws Exception {} // 오버라이딩 불가능
//        void add(int a, int b) throws NumberException {} // 오버라이딩 불가능
    }
}
