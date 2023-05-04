package ch11;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1; // 1<=x<46
//            set.add(new Integer(num));
            set.add(num); // 간단하게 num만 써도 된다. 이렇게 쓰면 컴파일러가 new Integer(num) 바꿔준다.
        }

//        System.out.println(set); // 정렬되지 않은 결과
        /**
         * Set은 정렬 불가, set을 List로 옮기고 그 다음 list를 정렬
         */
        List list = new LinkedList(set); // LinkedList(Collection c) 1. Set의 모든 요소를 List에 저장
        Collections.sort(list); // Collections.sort(List list) 2. list를 정렬
        System.out.println(list); // list를 출력
    }
}
