package ch07;

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("X = " + x);
        System.out.println("this.X = " + this.x);
        System.out.println("super.X = " + super.x);
    }
}

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
