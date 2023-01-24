package ch06;

class MyMath2 {
    long a, b; // 인스턴스 변수, 클래스 전체에서 사용가능
    
    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다. / 인스턴스 메서드(iv를 사용)
    long add() { return a+b; }
    long subtract() { return a-b; }
    long multiply() { return a*b; }
    double divide() { return a/b; }
    
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) { return a+b; } // a, b는 지역변수 / 클래스 메서드[static 메서드](iv를 사용안함)
    static long subtract(long a, long b) { return a-b; }
    static long multiply(long a, long b) { return a*b; }
    static double divide(long a, long b) { return a/b; }
}

public class Ex6_9 {
    public static void main(String[] args) {
        // 클래스 메서드 호출, 인스턴스 생성없이 호출가능 (static 메서드)
        System.out.println(MyMath2.add(200L, 100L)); // MyMath2는 클래스 이름
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        System.out.println("===============================================");
        MyMath2 mm = new MyMath2(); // 인스턴스를 생성 1. 객체 생성
        mm.a = 200L; // 인스턴스 변수 세팅
        mm.b = 100L; // 인스턴스 변수 세팅
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함. iv로 작업 2. 호출
        System.out.println(mm.add()); // mm은 참조변수
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}