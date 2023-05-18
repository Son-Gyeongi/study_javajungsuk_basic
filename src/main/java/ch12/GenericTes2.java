package ch12;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class GenericTes2 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(new Tv());
//        list.add(new Audio());
//        Tv t = (Tv) list.get(0); // list의 첫 번째 요소를 꺼낸다. 반환 타입이 Object라서 Tv타입으로 형변환

        // -> 지네릭 클래스로 바꿔보자
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv타입의 객체만 저장가능
        list.add(new Tv());
//        list.add(new Audio());
        Tv t = list.get(0); // 지네릭스를 이용하면 Tv타입을 지정해서 형변환이 필요없다. 반환타입 Tv
    }
}
