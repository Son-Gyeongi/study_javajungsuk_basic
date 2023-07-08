package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// 컬렉션 프레임웍과 함수형 인터페이스
public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i);

        // list의 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ", ")); // forEach는 Consumer<T>가 들어간다. 출력이 없다.
        // 또 다른 출력
//        System.out.println(list);
//        Iterator it = list.iterator(); // 이제는 이렇게 하지 않고 list.forEach(i -> System.out.print(i + ", ")); 한줄만 있으면 된다.
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        System.out.println();

        // list에서 2 또는 3의 배수를 제거한다. 조건에 맞는 요소 삭제
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        // list의 각 요소에 10을 곱한다.
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 {k,v}의 형식으로 출력한다.
        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        // 또 다른 출력
//        Iterator it = map.entrySet().iterator(); // 람다식을 쓰면서 컬렉션 프레임웍 코드들이 짧아졌다.
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        System.out.println();
    }
}
