package ch08;

public class Practice8_6 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            // System.exit : 자바 프로그램 강제종료, 0은 정상 종료/ 1은 비정상 종료
            // 프로그램이 즉시 종료되면서 finally블럭이 수행되지 않는다.
            if (b) System.exit(0);
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }

        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
    } // main
}

/**
 * 내가 예상한 결과
 * 1
 * 5
 * 6
 *
 * 실행 결과
 * 1
 */