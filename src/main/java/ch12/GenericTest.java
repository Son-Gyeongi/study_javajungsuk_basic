package ch12;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList(); // JDK1.5이전. 지네릭스 도입 이전
        //Integer만 저장할 수 있는 ArrayList
        // 타입 정보를 준다. 컴파일러한테 더 많은 정보를 준다.
        // <Integer> 실행 시 발생 했던 에러를 컴파일 타임에서 잡아준다.
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 여러 종류의 객체 저장 가능, JDK1.5이후 지네릭스 도입 이후는 아래와 같이 쓴는 게 좋다.
//        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10); // 오토박싱으로 바뀐다. list.add(new Integer(10));
        list.add(20); // Integer
//        list.add("30"); // String을 추가, 잘못된 타입이 들어가는 걸 막아준다.
        list.add(30); // 타입 체크가 강화됨. 지네릭스 덕분에

//        Integer i = (Integer) list.get(2); // 컴파일 OK
        Integer i = list.get(2); // 지네릭스 쓰면 형변환 생략 가능, Integer인 거 아니깐 형변환이 필요없다.
        // java.lang.ClassCastException 형변환 에러 - 실행 시 발생하는 에러(프로그램이 죽는다.
        // 컴파일 할 때는 문제 없었는데 실행할 때 문제 생겼다. 컴파일러의 한계

        System.out.println(list);
    }
}
