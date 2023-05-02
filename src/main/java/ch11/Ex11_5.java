package ch11;

import java.util.*;

public class Ex11_5 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        HashSet list = new HashSet(); // Set은 Collection의 자손 그래서 iterator 쓸 수 있다.
        // HashSet()이나 TreeSet() 사용하는 멤버의 개수는 똑같다.
        // 참조 변수가 Collection로 이 리모컨에 있는 메서드만 쓸 수 있다.
        Collection list = new TreeSet();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); // Collection클래스(List, Set, Map)가 바뀌어도 코드는 바꾸지 않아도 된다.

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator() 일회용, 한번 끝까지 읽고나면 iterator를 다시 얻어와야 한다.
//        it = list.iterator(); // 새로운 iterator 객체를 얻는다.
//        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }

        // iterator 대신에 for문으로 바꿔보자
        // 결과는 같지만 ArrayList에서 HashSet으로 바꾸면 for문은 동작하지 않는다.
        // HashSet에는 get이 없다., iterator를 사용한 코드는 똑같이 동작한다.
//        for (int i = 0; i < list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
    } // main
}
