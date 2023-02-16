package ch07;

class Parent2 {
    int x = 10; // super.x와 this.x 둘 다 가능
}

class Child2 extends Parent2 {
    void method() {
        System.out.println("X = " + x);
        System.out.println("this.X = " + this.x);
        System.out.println("super.X = " + super.x);
    }
}

public class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}
