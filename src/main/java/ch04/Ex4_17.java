package ch04;

public class Ex4_17 { // Ex4_13이 while문 좋은 예이다.
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }
    } // main의 끝
}
