package ch08;

public class ExceptionTest {
    public static void main(String[] args) {
//        system.out.println(args[0]); // 컴파일 에러 발생

        /**
         * 런타임 에러, 문법은 맞지만 JVM이 코드 실행할 때 발생하는 문제
         * args 매개변수로 넘어온 값이 없는데 출력하려고 해서 에러났다.
         */
        System.out.println(args[0]);
    }
}
