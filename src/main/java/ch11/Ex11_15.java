package ch11;

import java.util.Set;
import java.util.TreeSet;

// TreeSet은 범위 검색에 유용한 메서드를 제공 - subSet(), headSet(), tailSet()
public class Ex11_15 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
//        Set set = new TreeSet(); // 참조변수 Set 사용 안됨, headSet(), tailSet(), subSet()은 TreeSet에만 존재
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i=0; i<score.length; i++)
            set.add(new Integer(score[i])); // set.add(score[i]);도 가능

        System.out.println(set);
        System.out.println("50보다 작은 값 : " + set.headSet(50)); // 컴파일러가 오토박싱 해줌 new Integer(50)
        System.out.println("50보다 큰 값 : " + set.tailSet(50));
        System.out.println("40과 80 사이의 값 : " + set.subSet(40, 80)); // 40 <= x < 80
    }
}
