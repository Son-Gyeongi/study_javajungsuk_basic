package ch04;

public class Practice1 {
    public static void main(String[] args) {
        // 4-9 문제
        int num = 12345, sum = 0;

        while (num > 0) {
            sum += num%10;
            System.out.println("num = "+num);
            num /= 10;
        }
        System.out.println("sum = "+ sum);

        /* 4-8 문제
        int value =(int)(Math.random()*6) +1;

        System.out.println(value);
         */

        /* 4-7 문제
        String str = "12345";
        int sum =0;

        for (int i=0; i < str.length(); i++) {
            int num = str.charAt(i) - 48; // 'a' == 48을 빼면 문자에서 숫자로 나올 수 있다.
            System.out.println(num);
            sum += num;
        }

        System.out.println("sum= "+sum);
         */
    } // end of main
} // end of class
