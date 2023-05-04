package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set은 순서를 유지하지 않고 중복된 요소가 추가되는 걸 허용하지 않는다.
public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
//            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
            System.out.println(objArr[i] + "=" + set.add(objArr[i])); // set에 추가되었는 지 안 되었는 지 확인하기 위해 출력
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        // HashSet에 저장된 요소들을 출력한다. (Iterator이용)
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
