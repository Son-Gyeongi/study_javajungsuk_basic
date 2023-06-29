package ch12;

class Box12_1<T> { // 지네릭 타입 T를 선언
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class Practice12_1 {
    public static void main(String[] args) {
        Box12_1<String> box = new Box12_1<String>();

        // 에러. 대입된 타입이 반드시 같아야 한다.
//        Box12_1<Object> box1 = new Box12_1<String>();

        // 에러. Object타입을 Box<Object>타입의 참조변수에 저장 불가. (타입 불일치)
//        Box12_1<Object> box2 = (Object) new Box12_1<String>();

        // 에러. 대입된 타입이 String이므로, setItem(T item)의 매개변수 역시, String타입만 허용한다.
//        new Box12_1<String>().setItem(new Object());

        // OK. 대입된 타입인 String과 일치하는 타입을 매개변수로 지정했기 떄문에 OK
        new Box12_1<String>().setItem("ABC");
    }
}
