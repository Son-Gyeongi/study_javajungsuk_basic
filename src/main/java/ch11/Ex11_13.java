package ch11;
/**
 * Ex11_10 HashSet의 로또번호 만드는 예제랑 같다.
 * 그런데 HashSet은 LinkedList에 옮긴 다음에 정렬(sort()) 했다.
 * 정렬하려면 순서를 유지하는 List여야 한다.
 *
 * TreeSet의 장점 정렬을 따로 할 필요없다.
 */

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet - 범위 검색, 정렬에 유리, 정렬 필요없음
// 정렬된 로또번호 만들기
public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 정렬이 된다.
//        Set set = new HashSet(); // 정렬이 안된다. 그래서 정렬 필요
//        Set set = new TreeSet(new TestComp()); // 새로 만든 비교 기준을 넣어보자

        // 1~45 범위의 정수를 6개 골라서 set에 저장
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random()*45) +1; // 1<=x<46
            set.add(num); // set.add(new Integer(num));
            // Integer클래스는 Comparable 구현하고 있다. Integer클래스가 가지고 있는 정렬기준 이용
//            set.add(new Test()); // 형변환 예외 발생(java.lang.ClassCastException)
            // -> 비교 기준이 없어서 에러가 났다.
            // Set의 add()메서드는 비교하면서 저장한다. Test클래스는 비교 기준이 없다.
        }

        System.out.println(set);
    }
}

//class Test {} // 비교 기준인 없음.

/**
 * TreeSet은 비교 기준이 필요하기 때문에 둘 중에 하나는 해야한다. - 비교 기준 꼭 필요!!
 * 1. 저장하는 객체가 Comparable을 갖고 있던가. - set.add(new Test());
 *    객체가 비교 기준을 가지고 있던지
 * 2. TreeSet이 어떤 정렬 기준을 갖고 있던가. - Set set = new TreeSet(new TestComp());
 *    아니면 TreeSet이 비교 기준을 가지고 있던지
 */
// Test 클래스에 Comparable 구현하기
class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        return -1;
    }
}

// 비교 기준 만들기
class TestComp implements Comparator { // Comparator를 구현해야 한다.
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

}