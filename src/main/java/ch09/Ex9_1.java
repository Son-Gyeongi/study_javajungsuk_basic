package ch09;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        // Object클래스의 equals()메서드는 객체의 주소를 비교한다.(참조변수의 값으로 판단)
        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    } // main
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
