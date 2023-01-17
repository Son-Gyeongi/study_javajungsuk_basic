package ch06;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L); // add 메서드 호출
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(3L, 5L); // 둘 중에 큰 값을 반환하는 메서드
        long result6 = mm.min(3L, 5L); // 둘 중에 작은 값을 반환하는 메서드
        mm.printGugudan(12); // 구구단 3단을 출력

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println("max(3L, 5L) = " + result5);
        System.out.println("min(3L, 5L) = " + result6);
    }
}

class MyMath {
    // 구구단 출력 메서드
    void printGugudan(int dan) {
        if(!(2<=dan&& dan <=9)) {
            return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
        }
        for (int i=1;i<=9;i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan*i);
        }
//        return;
    }

    long add(long a, long b) {
        long result = a + b;
        return result;
        // result a+b; 위릐 두 줄을 이와 같이 한줄로 간단히 할 수 있다.
    }
    // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오
    long max(long a, long b) {
        if (a>b) {
            return a; // 조건식이 참일때만 실행
        } else {
            return b; // 조건식이 거짓일 때 실행
        }
    }
    // 두 값을 받아서 둘중에 작은 값을 반환하는 메서드를 작성하시오
    long min(long a, long b) {return a<b? a:b;}
    long subtract(long a, long b) { return a-b; }
    long multiply(long a, long b) { return a*b; }
    double divide(double a, double b) { return a/b; }
}
