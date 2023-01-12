package ch04;

public class Ex4_13 { // Ex4_13이 while문 좋은 예이다.
    public static void main(String[] args) {
        int sum =0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }
    } // main의 끝
}
