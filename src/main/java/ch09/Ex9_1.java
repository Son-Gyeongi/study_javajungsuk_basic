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

    // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    public boolean equals(Object obj) {
//        return this==obj; // Object클래스 원래 코드 - 주소 비교, 서로 다른 객체는 항상 거짓

        // 객체에 저장된 내용을 비교하기
        // obj에는 value 멤버변수가 없어서 형변환 해줘야 한다.
        // 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
//        if (obj instanceof Value) // obj 인스턴스가 Value인 경우에만 형변환 한다.
        if (!(obj instanceof Value)) return false;

        Value v = (Value) obj;// obj를 Value로 형변환 해야한다.

        return this.value==v.value;
    }
}
