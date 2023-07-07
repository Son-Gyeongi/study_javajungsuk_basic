package ch14;

public class Ex14_0 {
    public static void main(String[] args) {
        // 람다식은 함수형 인터페이스로 다루어야 한다.
//        Object obj = (a, b) -> a > b ? a : b; // 람다식. 익명객체

        /**
         * 익명 객체가 있을 때
         * int max(int a, int b) { 메서드 부분을 표현한 게 람다식이다.
         */
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        /**
         * 참조변수 obj 타입이 Object이다.
         * Object타입의 리모컨에는 max()메서드가 없다. 그래서 호출할 수 없다.
         * 그래서 필요한 게 함수형 인터페이스이다.
         */
//        int value = obj.max(3, 5); // 함수형 인터페이스

        // 2. 함수형 인터페이스 타입의 참조변수를 가지고 람다식을 다루면 된다.
//        MyFunction2 f = new MyFunction2() {
//            public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못바꾼다.
//                return a > b ? a : b;
//            }
//        };
        // 위 익명클래스의 객체를 람다식으로 바꿔보자.
        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식.

        int value = f.max(3, 5);
        System.out.println("value = " + value);
    }
}

// 1. 함수형 인터페이스 선언 (람다식을 다루기 위해서 사용)
// 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함. 추상 메서드가 2개면 에러
@FunctionalInterface // 함수형 인터페이스를 올바르게 작성했는지 컴파일러가 확인해준다.
interface MyFunction2 {
//    public abstract int max(int a, int b);
    // 인터페이스의 모든 메서드는 public이면서 동시에 abstract이다.
    int max(int a, int b);
}