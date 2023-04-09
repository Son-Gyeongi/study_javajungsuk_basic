package ch08;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]); // 배열 범위 벗어남 ArrayIndexOutOfBoundsException 발생
            System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            // Exception은 모든 예외의 최고 조상, 모든 예외가 처리 가능
            // Exception이 선언된 catch블럭은 제일 마지막에 와야한다.
            // ArithmeticException을 제외한 모든 예외가 처리된다.
            System.out.println("Exception");
        } // try-catch의 끝
        System.out.println(6);
    } // main메서드의 끝
}
