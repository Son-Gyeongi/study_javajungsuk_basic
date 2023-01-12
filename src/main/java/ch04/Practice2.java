package ch04;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 4-10 문제
        // 1-~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random()*100)+1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        // 화면으로부터 사용자 입력을 받기 위해서 Scanner클래스 사용
        Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.

            if (input > answer) {
                System.out.println("적은 값을 입력해주세요");
            } else if (input < answer) {
                System.out.println("큰 값을 입력해주세요.");
            } else {
                System.out.println("정답입니다. 시도횟수 = "+ count);
                break;
            }

        } while (true); // 무한 반복문
    } // end of main
} // end of class
