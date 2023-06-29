package ch12;

// Ex12_4 참고
class Juicer12_2 {
    static <T extends Fruit2> String makeJuice(FruitBox2<T> box) {
        String tmp = "";
        for (Fruit2 f : box.getList())
            tmp += f + "";
        return tmp;
    }
}

public class Practice12_2 {
    public static void main(String[] args) {
        // 에러. 지네릭 메서드에 대입된 타입이 Apple2이므로,
        // 이 메서드의 매개변수는 'FruitBox2<Apple2>' 타입이 된다.
        // new FruitBox2<Fruit2>()는 매개 변수의 타입과 일치하지 않으며,
        // 자동형변환도 불가능한 타입이므로 에러이다.
//        Juicer12_2.<Apple2>makeJuice(new FruitBox2<Fruit2>());

        // 에러. Grape2가 Fruit2의 자손이라고 해도, 타입이 다르기 때문에 같은 이유로 에러.
//        Juicer12_2.<Fruit2>makeJuice(new FruitBox2<Grape2>());

        // OK
        Juicer12_2.<Fruit2>makeJuice(new FruitBox2<Fruit2>());

        // OK
        // 지네릭 메서드의 타입 호출이 생략된 형태
        // 생략하지 않았다면, Juicer12_2.<Apple2>makeJuice(new FruitBox2<Apple2>()); 과 같다.
        // 대부분의 경우 이처럼 생략한다.
        Juicer12_2.makeJuice(new FruitBox2<Apple2>());

        // 에러. 지네릭 메서드의 타입 호출이 생략되지 않았다면,
        // Juicer12_2.<Object>makeJuice(new FruitBox2<Object>()); 과 같다.
        // 위의 코드와 같이 타입이 일치하긴 하지마, <T extends Fruit>로 제한이 걸려있으므로,
        // 타입 T는 Fruit의 자손이어야 한다. Object는 Fruit의 자손이 아니므로 에러.
//        Juicer12_2.makeJuice(new FruitBox2<Object>());
    }
}
