package ch04;

public class Ex4_11_gugu {
    public static void main(String[] args) { // i=1,2,3
        for (int i = 2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                System.out.println(i + " * " + j + " = "+ (i*j));
            }
            System.out.println();
        }
    } // main의 끝
}
