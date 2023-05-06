package ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.addAll;
import static java.util.Collections.rotate;
import static java.util.Collections.swap;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.binarySearch;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.fill;
import static java.util.Collections.nCopies;
import static java.util.Collections.disjoint;
import static java.util.Collections.copy;
import static java.util.Collections.replaceAll;
import static java.util.Collections.enumeration;
import static java.util.Collections.list;
// import static - static 멤버 사용할 때 앞에 클래스 이름 뺄 수 있다.
// import static java.util.Collections.*; Collections를 생략 가능하게 해준다.

// Collections는 컬렉션과 관련된 메서드를 제공
// java.util.Collection은 인터페이스이고 java.util.Collections는 클래스이다.
public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5); // 가변인자로 갯수 제한없이 적을 수 있다.
//        Collections.addAll(list, 1, 2, 3, 4, 5); // 원래는 Collections가 앞에 붙지만 import static해줘서 생략가능
        System.out.println(list);

        rotate(list, 2); // 반시계방향으로 두 번 회전
        System.out.println(list);

        swap(list, 0, 2); // 첫 번째와 세 번쨰를 교환(swap), 인덱스 0과 2 교환
        System.out.println(list);

        shuffle(list); // 저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder()); // 역순 정렬 reverse(list);와 동일
        System.out.println(list);

        sort(list); // 정렬
        System.out.println(list);

        // binarySearch() 쓰기 전에 항상 sort() 정렬을 먼저 해야한다.
        int idx = binarySearch(list, 3); // 3이 저장된 위치(index)를 반환
        System.out.println("index of 3 = " + idx);

        System.out.println("max = "+max(list));
        System.out.println("min = "+min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        fill(list, 9); // list를 9로 채운다.
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true

        copy(list, newList); // newList에 있는 걸 list로 복사
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1); // list에서 2를 1로 바꾼다.
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = " + list2);
    }
}
