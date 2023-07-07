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
    }
}
