package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// 코드 실행 결과 문제
// 각 컬렉션 클래스들의 특징을 이해하고 있는지 확인하는 문제
public class Practice11_1 {
    public static void main(String[] args) {
        /**
         * ArrayList
         * 중복을 허용하고 저장순서 유지
         */
        ArrayList list = new ArrayList();
        list.add(3); // list.add(new Integer(3));이랑 같다.
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        System.out.println("list = " + list); // [3,6,2,2,2,7]

        /**
         * HashSet
         * 중복을 허용하지 않는다. 순서 유지 안된다.
         */
        HashSet set = new HashSet(list);
        // 중복 요소들이 제거되고 순서유지 안된다.
        System.out.println("set = " + set); // [3,6,2,7]

        /**
         * TreeSet
         * 정렬해서 저장
         * 따로 정렬기준을 주지 않았다. 그래서 숫자의 기본정렬인 오름차순으로 정렬
         */
        TreeSet tset = new TreeSet(set);
        System.out.println("tset = " + tset); // [2,3,6,7]

        /**
         * Stack
         * 스택에 넣었다 꺼내면 저장순서가 반대가 된다.
         */
        Stack stack = new Stack();
        stack.addAll(tset);
        System.out.println("stack = " + stack); // [2,3,6,7]

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
