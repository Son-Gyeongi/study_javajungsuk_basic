package ch11;

import java.util.TreeSet;

// TreeSet 컬렉션 클래스의 subSet()메서드 사용 - 범위 검색
// TreeSet의 장점 - 범위 검색에 유리(from~to)
public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");      set.add("alien");    set.add("bat");
        set.add("car");      set.add("Car");      set.add("disc");
        set.add("dance");    set.add("dZZZZ");    set.add("dzzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        // b하고 d사이에 있는 단어들 찾아서 출력 b<=x<d
        System.out.println("result1 : " + set.subSet(from, to));
        // b하고 dzzz사이에 있는 단어들 찾아서 출력 b<=x<dzzz
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }
}
