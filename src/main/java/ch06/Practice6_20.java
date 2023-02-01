package ch06;

import java.util.Arrays;

public class Practice6_20 {
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0)
            return -999999;

        int max = arr[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.

        for (int i=1; i< arr.length;i++) { // 배열의 두 번째 값부터 비교한다. 첫번째 값으로 초기화 했으므로 첫번째값은 비교할 필요 없다.
            if (arr[i] > max) // 배열의 i번째 요소가 max보다 크면
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: "+max(data));
        System.out.println("최대값: "+max(null));
        System.out.println("최대값: "+max(new int[] {})); // 크기가 0인 배열
    }
}
