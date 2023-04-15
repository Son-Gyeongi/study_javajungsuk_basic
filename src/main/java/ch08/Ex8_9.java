package ch08;

public class Ex8_9 {
    /**
     * 예외선언 : 예외를 떠넘기기만 해서는 예외를 처리할 수 없다.
     * try-catch문이 있어야지 예외 처리가 된다.
     */
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception {
        method2();
    } // method1의 끝

    static void method2() throws Exception {
        throw new Exception();
    } // method2의 끝
}
