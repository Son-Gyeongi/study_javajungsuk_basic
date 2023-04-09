package ch08;

public class Ex8_7 {
    public static void main(String[] args) {
//        throw new Exception(); // Exception을 고의로 발생시킨다.
        // 에러 error: unreported exception java.lang.Exception; must be caught or declared to be thrown
        // 컴파일 에러, 컴파일조차 안된다.
        // Exception과 자손은 예외처리 필수 -> try-catch문 필수

        // checked 예외는 try-catch문을 써줘야 컴파일 에러가 나지 않는다.
        // Exception과 그 자손은 반드시 예외처리를 해줘야한다. (필수)
        try {
            throw new Exception();
        } catch (Exception e) {}

        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다. (선택)
        throw new RuntimeException();
    }
}
