package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능 그런데 list1.add(5)라고 써도 된다.
        // autoboxing에 의해 기본형이 참조형으로 자동 변환된다.
        // 원래는 ArrayList에는 기본형을 넣을 수 없다.
        list1.add(new Integer(5)); // list1.add(5) 써도 컴파일러가 autoboxing으로 new Integer(5)로 자동으로 바꿔준다.
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // subList : ArrayList에서 일부를 뽑아서 새로운 리스트를 만든다.
        // subList로 만든 리스트는 읽기 전용이다.
        // 그래서 new ArrayList로 만들어 줘야지 변경 가능하다.
        // ArrayList(Collection c) 사용
        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1 <= x < 4
        print(list1, list2);

        // 컬렉션 정렬 (기본적으로 오름차순)
        // Collection은 인터페이스, Collections는 유틸 클래스
        // Collections는 유틸 클래스 : Collection을 다루는데 필요한 메서드들을 제공하는 클래스이다.
        Collections.sort(list1); // list1과 list2를 정렬한다.
        Collections.sort(list2); // Collections.sort(List l)
        print(list1, list2);

        // list1이 list2의 모든 요소를 포함하고 있는가
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
        print(list1, list2);

        // 변경
        list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
        print(list1, list2);

        // 중요 - indexOf() 테스트
        // 인덱스가 0인곳에 문자열 "1"을 넣는다. 그러면 기존에 있는 요소들이 한 칸씩 밀려난다.
        list1.add(0, "1");
        print(list1, list2);
        /**
         * 결과
         * list1: [1, 0, 1, 2, 3, 4, 5]
         * 0 번째 인덱스 1은 "1" 문자열 String 이다.
         * 2 번째 인덱스 1은 Integer이다.
         * 출력은 같지만 타입은 다르다.
         */
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        // list1에서 문자열 "1"이 어디있는지 알려준다.
        System.out.println("index="+list1.indexOf("1")); // 결과 index=0
        System.out.println("index=" + list1.indexOf(1)); // 결과 index=2, 원래는 new Integer(1) 이렇게 써야함.
//        list1.remove(1); // 인덱스가 0인 객체를 삭제, Object remove(int index)를 호출
        list1.remove(new Integer(1)); // 숫자1을 삭제, boolean remove(Object obj)를 호출

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i); // 인덱스가 i인 곳에 저장된 요소를 삭제
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
} // class
