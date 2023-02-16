package ch07;

class MyPoint2 {
    int x;
    int y;
}

//class Circle extends MyPoint { // 상속
//    int r;
//}
class Circle2 extends Object { // 포함 // 컴파일러에서 extends Object가 자동 추가됨
    MyPoint2 p = new MyPoint2(); // 참조변수의 초기화
    int r;
}

public class InheritanceTest2 {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        System.out.println(c.toString()); // ch07.Circle2@2a139a55 클래스이름@객체의 주소값
        System.out.println(c); // ch07.Circle2@2a139a55
        // println()메서드에서 참조변수가 들어오면 내부적으로 toString 을 호출한다. 위에 두 출력문 결 결과가 같다.

        Circle2 c2 = new Circle2();
        System.out.println(c2.toString()); // ch07.Circle2@15db9742
    }
}
