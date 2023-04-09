package ch08;

// try블럭 내에서 예외가 발생한 경우
public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticException 산술계산 예외를 발생시킨다.
            System.out.println(2);
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } // try-catch의 끝
        System.out.println(4);
    } // main메서드의 끝
}
