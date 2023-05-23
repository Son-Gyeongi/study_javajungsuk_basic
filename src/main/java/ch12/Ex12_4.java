package ch12;

import java.util.ArrayList;

class Fruit2 { public String toString() { return "Furit"; }}
class Apple2 extends Fruit2 { public String toString() { return "Apple"; }}
class Grape2 extends Fruit2 { public String toString() { return "Grape"; }}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    // 매개변수에 와일드카드
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        // 향상된 for문
        for (Fruit2 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        // 와일드카드 : Fruit2와 그 자손들 (Apple, Grape)
//        FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();
//        // 하나의 참조변수호 대입된 지네릭 타입이 다 다른 3개 객체를 다 다룰 수 있다.
//        appleBox = new FruitBox2<Fruit2>();
//        appleBox = new FruitBox2<Apple2>();
//        appleBox = new FruitBox2<Grape2>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    } // main
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>(); // item을 저장할 lsit
    void add(T item) { list.add(item); } // 박스에 item 추가
    T get(int i) { return list.get(i); } // 박스에서 item 꺼내기
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
