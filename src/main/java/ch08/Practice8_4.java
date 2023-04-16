package ch08;

public class Practice8_4 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) throw new ArithmeticException(); // ArithmeticException는 RuntimeException의 자손
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return; // 메서드를 빠져나간다. (finally블럭을 수행한 후에)
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장
        }

        System.out.println(6);
    }
    public static void main(String[] args) {
        method(true);
        method(false);
    } // main
}

/**
 * 내 예상 결과
 * 1
 * 4
 * 5
 * 6
 * 1
 * 2
 * 5
 * 6
 *
 * 실행 결과
 * 1
 * 3
 * 5
 * 1
 * 2
 * 5
 * 6
 */
