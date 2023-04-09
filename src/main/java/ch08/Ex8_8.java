package ch08;

public class Ex8_8 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
        // 성공적으로 컴파일은 된다.
        // RuntimeException과 자손은 예외처리 선택 -> try-catch문 선택
    }
}
