package ch11;

import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4}; // 1차원 배열
        int[][] arr2D = {{11, 12, 13}, {21, 22, 34}}; // 2차원 배열

        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.deepToString(arr2D));
//        System.out.println("arr2D=" + Arrays.toString(arr2D)); 2차원 배열 이렇게 출려하면 원하는 값이 나오지 않는다.

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 2 <=x < 4
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 0 <=x < 7

        System.out.println("arr2=" + Arrays.toString(arr2));
        System.out.println("arr3=" + Arrays.toString(arr3));
        System.out.println("arr4=" + Arrays.toString(arr4));
        System.out.println("arr5=" + Arrays.toString(arr5));
        System.out.println("arr6=" + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9); // arr7=[9,9,9,9,9]
        System.out.println("arr7=" + Arrays.toString(arr7));

        // 람다식 i -> (int) (Math.random() * 6) + 1
        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7=" + Arrays.toString(arr7));

        for (int i : arr7) { // 향상된 for문, arr7 배열의 요소들을 순서대로 꺼내서 i에 넣는다.
//        for (int x = 0; x < arr7.length; x++) { 향상된 for문과 같다.
//            int i = arr7[x];
            char[] graph = new char[i]; // 배열 생성
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
        System.out.println("= After sorting =");
        Arrays.sort(chArr); // 배열을 정렬. binarySearch(이진탐색)하기 전에는 반드시 정렬 먼저
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
    }
}
