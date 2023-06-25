package ch12;

import java.util.ArrayList;

// Ex12_3 참고
// 지네릭 타입의 형변환
class FruitCasting implements EatableCasting {
    public String toString() { return "Fruit";}
}
class AppleCasting extends FruitCasting { public String toString() { return "Apple";} }
class GrapeCasting extends FruitCasting { public String toString() { return "Grape";} }
class ToyCasting { public String toString() { return "Toy";} }

interface EatableCasting {}

public class GenericTypeCasting {
    public static void main(String[] args) {
        Box b = null;
        // Box b = (Box) new Box<String>();
        // 원시 타입으로 String객체를 가리키는게 가능하다. (Box)가 생략 된거다.
        Box<String> bStr = null;

        b = (Box) bStr; // Box<String> -> Box 가능하지만 경고 발생
        bStr = (Box<String>) b; // Box -> Box<String> 가능하지만 경고 발생

        // (FruitBoxCasting<? extends FruitCasting>) 형변환이 생략 되어있다.
        // 좌변과 우변이 타입 불일치하다. 대입된 지네릭 타입이 다르다. -> 형변환 필요
        FruitBoxCasting<? extends FruitCasting> fbox =
                (FruitBoxCasting<? extends FruitCasting>) new FruitBoxCasting<FruitCasting>();
        // FruitBoxCasting<AppleCasting> -> FruitBoxCasting<? extends AppleCasting> 형변환 가능
        FruitBoxCasting<? extends AppleCasting> abox = new FruitBoxCasting<AppleCasting>();

        // 반대도 가능 할까? 가능!
        // FruitBoxCasting<? extends AppleCasting> -> FruitBoxCasting<AppleCasting> 형변환 가능
        FruitBoxCasting<AppleCasting> applebox = (FruitBoxCasting<AppleCasting>) abox; // OK. 경고 발생
    } // main
}

class FruitBoxCasting<T extends FruitCasting & EatableCasting> extends Box<T> {}

class BoxCasting<T> {
    ArrayList<T> list = new ArrayList<T>(); // item을 저장할 lsit
    void add(T item) { list.add(item); } // 박스에 item 추가
    T get(int i) { return list.get(i); } // 박스에서 item 꺼내기
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
