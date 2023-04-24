package ch09;

import java.util.ArrayList;

public class Ex9_16_Test {
    public static void main(String[] args) {
        // ArrayList : Integer를 저장할 수 있는 배열 객체
        // ArrayList는 객체만 저장가능한 클래스
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list에 저장
        list.add(100); // JDK1.5 이전에는 에러
        list.add(new Integer(100)); // 원래는 list에는 객체만 추가가능

        // list에서 꺼내기 (실제 저장된 건 객체)
//        Integer i = list.get(0); // list에 저장된 첫번째 객체르 꺼낸다.
//        int i = list.get(0).intValue(); // intValue()로 Integer를 itn로 변환
        int i = list.get(0); // intValue()로 Integer를 itn로 변환
    }
}
