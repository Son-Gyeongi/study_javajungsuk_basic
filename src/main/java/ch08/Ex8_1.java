package ch08;

// try블럭 내에서 예외가 발생하지 않은 경우
public class Ex8_1 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4); // 실행되지 않는다
        } // try-catch의 끝
        System.out.println(5);
    }
}
