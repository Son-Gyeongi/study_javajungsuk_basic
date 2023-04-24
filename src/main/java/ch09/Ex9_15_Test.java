package ch09;

public class Ex9_15_Test {
    public static void main(String[] args) {
//        int i = Integer.parseInt("100");
        System.out.println("i="+Integer.parseInt("100")); // 10진수, 10이 생략되어 있다.
        System.out.println("i="+Integer.parseInt("100", 10)); // 위와 동일
        System.out.println("i="+Integer.parseInt("100", 2)); // 2진수
        System.out.println("i="+Integer.parseInt("FF", 16)); // 16진수
    }
}
