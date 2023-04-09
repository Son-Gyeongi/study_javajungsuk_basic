package ch08;

public class Ex8_8 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
        // 성공적으로 컴파일은 된다. 컴파일이 잘 된다고 해서 실행했을 때 예외가 발생하지 않는게 아니다.
        // RuntimeException과 자손은 예외처리 선택 -> try-catch문 선택

        /**
         * 에러가 안 나게 예외처리 예시
         * try {
         *      throw new RuntimeException();
         *  } catch (Exception e) {
         *
         *  }
         */

    }
}
