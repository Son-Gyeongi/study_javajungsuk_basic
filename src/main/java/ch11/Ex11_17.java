package ch11;

import java.util.*;

// HashMap
public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            /**
             * Map인터페이스 안에 Entry 인터페이스가 있다.
             * 앞에 static이 붙어있지 않지만 생략된 것이다. 인터페이스 안에 선언된 내부클래스나
             * 인터페이스는 모두 static이 붙는다. 그래서 Map.Entry로 표현한다.
             */
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고점수 : "+Collections.max(values));
        System.out.println("최저점수 : "+Collections.min(values));
        /**
         * Collections.max() 이거 안에는 Comparable을 구현한 것들만 들어올 수 있다.
         * 최대값, 최소값은 비교기준이 있어야 최대인지 최소인지 알 수 있기 때문이다.
         * Comparable 구현한 클래스 객체만 들어올 수 있다.
         */
    }
}
