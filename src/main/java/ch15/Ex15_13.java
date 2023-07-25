package ch15;

/**
 * 표준 입출력의 대상변경
 * System.out, System.err 모두 출력대상이 콘솔이기 떄문에
 * System.out 대신 System.err을 사용해도 같은 결괄르 얻는다.
 */
public class Ex15_13 {
    public static void main(String[] args) {
        System.out.println("out : Hello World!");
        System.err.println("err : Hello World!");
    }
}
