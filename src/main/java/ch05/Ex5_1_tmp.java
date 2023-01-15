package ch05;

import java.util.Arrays;

public class Ex5_1_tmp {
    public static void main(String[] args) {
        // Arrays 클래스들의 메서드들
        int[] arr = {0,1,2,3,4}; // 1차원 배열 arr
        int[][] arr2D = {{11,12}, {21,22}}; // 2차원 배열 arr2D

        // 배열 출력
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        // 배열 비교
        String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(str2D==str2D2); // 참조변수 값 비교
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        // 배열 복사
        int[] arr2 = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 2,4);
        System.out.println(Arrays.toString(arr3));

        // 배열 정렬
        int[] arr4 = {1,4,3,0,2};
        Arrays.sort(arr4); // 배열 arr을 오름차순으로 정렬
        System.out.println(Arrays.toString(arr4));

        /* String 클래스 메서드들
        String str = "ABCDE";
        char ch = str.charAt(2);
        String str2 = str.substring(1, 4); // 결과 : BCD
        String str3 = str.substring(1); // 1~4 결과 : BCDE (1) == (1, str.length())
        String str4 = str.substring(1, str.length());
        System.out.println(str4);
         */

        /* 배열의 인덱스 범위
        // index: 0~3-1, 0~2
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for (int i=0; i<10; i++) {
            int tmp = (int)(Math.random()*3);
            System.out.println(strArr[tmp]); // 범위 0~2
        }
         */

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
