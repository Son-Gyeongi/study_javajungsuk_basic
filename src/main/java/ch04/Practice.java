package ch04;

public class Practice {
    public static void main(String[] args) {
        // 4-6 문제
        for (int i=1; i<=6; i++)
            for (int j=1; j<=6; j++)
                if(i+j == 6)
                    System.out.println(i+"+"+j+"="+(i+j));

        /* 4-4 문제
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        // 조건식의 값이 true이므로 무한반복문이 된다.
        for (int i=1; true; i++, s=-s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
            num = s* i; // i 와 부호(s)를 곱해서 더할 값을 구한다.
            sum += num;

            if (sum >= 100) { // 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
                break;
            }
        }
        System.out.println("num = "+num);
        System.out.println("sum = "+sum);
         */

        /* 4-3문제
        int sum = 0;
        int totalSum = 0;

        for (int i =1; i <=10; i++) {
            sum += i;
            System.out.printf("sum = %2d + %2d %n ", sum, i);
            totalSum += sum;
        }
        System.out.println(totalSum);
         */

        /* 4-2 문제
        int sum = 0;

        for (int i=1; i <=20; i++) {
//            if (i%2!=0 && i%3!=0) {
//                sum += i;
//            }
            if (!(i%2==0 || i%3==0)) {
                sum += i;
            }
        }
        System.out.println(sum);
         */
    }
}
