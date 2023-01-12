package ch04;

public class Ex4_12 { // while문으로 이런식으로 코딩한다. Ex4_13이 while문 좋은 예이다.
    public static void main(String[] args) {
        int i = 5; // 반복할 횟수를 넣는다.

        while (i-- != 0) {
            System.out.println(i + " - I can do it.");
        }
    } // main의 끝
}
