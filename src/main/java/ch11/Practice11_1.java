package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// 코드 실행 결과 문제
public class Practice11_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3); // list.add(new Integer(3));이랑 같다.
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        System.out.println("list = " + list); // [3,6,2,2,2,7]

        HashSet set = new HashSet(list);
        System.out.println("set = " + set); // [3,6,2,7]
        TreeSet tset = new TreeSet(set);
        System.out.println("tset = " + tset); // [2,3,6,7]
        Stack stack = new Stack();
        stack.addAll(tset);
        System.out.println("stack = " + stack); // [2,3,6,7]

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
