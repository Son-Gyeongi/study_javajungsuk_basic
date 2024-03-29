package ch08;

public class Practice8_8 {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7);
        }
    }

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println(2);
            /**
             * method2메서드에서 발생한 예외를 method1() try-catch문에서 처리했다가 다시 발생시킨다.
             */
            throw e; // 예외를 다시 발생시킨다. 예외 던지기
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    } // method1()

    static void method2() {
        throw new NullPointerException();
    }
}

/**
 * 내 예상 결과
 * 2
 * 7
 *
 * 실행 결과
 * 2
 * 4
 * 7
 */