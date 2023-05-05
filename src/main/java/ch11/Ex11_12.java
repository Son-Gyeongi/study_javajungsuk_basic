package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        // 교집합 - setA와 setB 중에 공통된 걸 구한다.
//        Iterator it = setB.iterator();
//        while (it.hasNext()) {
//            Object tmp = it.next();
//            if (setA.contains(tmp))
//                setKyo.add(tmp);
//        }
//
//        // 차집합 - setB에 없는 것만 차집합에 저장
//        it = setA.iterator();
//        while (it.hasNext()) {
//            Object tmp = it.next();
//            if (!setB.contains(tmp))
//                setCha.add(tmp);
//        }
//
//        // 합집합 (중복되는 건 없어진다. Set특징: 순서가 없고 중복이 허용되지 않는다.
//        it = setA.iterator();
//        while (it.hasNext()) {
//            setHab.add(it.next());
//        }
//
//        it = setB.iterator();
//        while (it.hasNext()) {
//            setHab.add(it.next());
//        }
//
//        System.out.println("A ∩ B = " + setKyo); // 문자기호 - 한글 ㄷ 누르고 한자키
//        System.out.println("A ∪ B = " + setHab);
//        System.out.println("A - B = " + setCha);

        // 코드를 더 간단하게 적을 수 있다. 이런 일을 해주는 코드들이 있다.
        // 교집합. 공통된 요소만 남기고 삭제
        setA.retainAll(setB); // setA에서 setB에 있는 것만 남긴다.
        System.out.println(setA);

        // 합집합. setB의 모든 요소를 추가(중복 제외)
        setA.addAll(setB);
        System.out.println(setA);

        // 차집합. setB와 공통 요소를 제거
        setA.removeAll(setB); // setA에서 setB에 있는 걸 다 지운다.
        System.out.println(setA);
    }
}
