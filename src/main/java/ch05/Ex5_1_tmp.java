package ch05;

import java.util.Arrays;

public class Ex5_1_tmp {
    public static void main(String[] args) {
        // Ex5_5
        // index: 0~3-1, 0~2
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for (int i=0; i<10; i++) {
            int tmp = (int)(Math.random()*3);
            System.out.println(strArr[tmp]); // 범위 0~2
        }

        // Ex5_1
        /* 배열 선언과 생성
//        int[] score; // 1. 배열 score를 선언 (참조변수 선언)
//        score = new int[5]; // 2. 배열의 생성 (int 저장공간 x 5)

        // 위 2문장 하나로 합쳐서 사용할 수 있다.
        int[] score = new int[5]; // 배열의 선언과 생성을 동시에
        score[3] = 100;

        for (int i = 0; i<score.length; i++) {
            System.out.println("score["+i+"] = " + score[i]);
        }

        int value = score[3];
        System.out.println("value= "+value);
         */

        /*
        // index 범위 : 0~4
        int[] arr = new int[5]; // 길이가 5인 int 배열 arr을 생성
        System.out.println(arr.length);

        for (int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"] = " + arr[i]);
        }
         */

        /*
        int[] iArr = {100,95,80,70,60}; // 길이가 5인 int 배열
        for (int i=0; i < iArr.length;i++) {
            System.out.println(iArr[i]);
        }

        System.out.println(Arrays.toString(iArr));
         */
    }
}
