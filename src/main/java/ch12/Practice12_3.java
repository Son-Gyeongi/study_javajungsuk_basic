package ch12;

// Ex12_4 참고
class Box12_3<T extends Fruit2> { // 지네릭 타입 T를 선언
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class Practice12_3 {
    public static void main(String[] args) {
        // OK
        // Box12_3<?>는 Box12_3<? extends Object>를 줄여서 쓴 것이다.
        // 객체 생성에 지네릭 타입을 지정해 주지 않았지만 문제가 되지는 않는다.
        // 그래도, new Box12_3() 대신 new Box12_3<>()을 사용하는 것이 좋다.
        Box12_3<?> b1 = new Box12_3();

        // OK
        // new Box12_3<>();는 타입을 생략한 것으로, 일반적으로는 참조변수의 타입과 같은 타입으로 간주된다.
        // 참조변수의 타입이 <?>, 즉 <? extends Object>이므로 생략된 타입은 Object이라고 생각하기 쉬운데,
        // 여기서는 지네릭 클래스 Box12_3에 정의된 타입이 <T extends Fruit2>와 같이 제한되어 있기 때문에,
        // 'Object'가 아니라 'Fruit2'가 생략된 것으로 봐야 한다.
        // 그래서 Box12_3<?> b2 = new Box12_3<Object>();와 같이 하면 에러가 발생한다.
        // Object는 Fruit2의 자손이 아니기 때문이다.
        Box12_3<?> b2 = new Box12_3<>(); // Box12_3<?> b2 = new Box12_3<Fruit2>();와 동일
        /**
         * 'Box12_3<? extends Object>'는 Box12_3<Object>와 같지 않음에 주의하다.
         * 지네릭 클래스 Box12_3는 타입 T가 Fruit2의 자손으로 제한되어 있기 때문에,
         * Box12_3<Object>와 같이 Fruit2의 자손이 아닌 클래스를 대입할 수 없다.
         * 그라나, 'Box12_3<? extends Object>'와 같이 와일드 카드를 사용하는 것은 가능하다.
         */

//        Box12_3<?> b3 = new Box12_3<Object>(); // 에러. 위의 설명 참고

        // 에러. 타입 불일치
//        Box12_3<Object> b4 = new Box12_3<Fruit>();

        // OK
        // 바람직하지 않음
        // 'Box12_3<?> b5가 더 나음.
        Box12_3 b5 = new Box12_3<>();

        // OK
        Box12_3<? extends Fruit2> b6 = new Box12_3<Apple2>();

        // 에러
        // new 연산자는 타입이 명확해야하므로 와일드 카드와 같이 사용불가
//        Box12_3<? extends Object> b7 = new Box12_3<? extends Fruit2>();
    }
}
