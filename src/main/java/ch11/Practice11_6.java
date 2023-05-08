package ch11;

import java.util.*;

public class Practice11_6 {
    public static void main(String[] args) {
        /**
         * 중복된 값을 허용하지 않는다는 특성을 이용해서
         * HashSet에 서로 다른 임의의 값을 저장하는 것까지는 좋았는데,
         * 해싱 알고리즘의 특성상 같은 값은 같은 자리에 저장되기 때문에
         * 빙고판의 숫자들이 잘 섞이지 않는다는 문제가 발생
         */
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        /**
         * 그래서 저장순서를 유지하는 ArrayList에 HashSet의 데이터를 옮겨 담은 다음,
         * Collections.shuffle()을 이용해서 저장된 데이터들의 순서를 뒤섞었다.
         */
        ArrayList list = new ArrayList(set); // set과 같은 데이터를 가진 ArrayList를 생성
        Collections.shuffle(list); // list에 저장된 데이터의 순서를 섞는다.

        Iterator it = list.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    } // main
}
/**
 * 대부분의 컬렉션 클래스들은 다른 컬렉션으로 데이터를 쉽게 옮길 수 있게 설계되어 있다.
 * 매개변수의 타입이 Collection 인터페이스이므로 Collection 인터페이스의 자손인
 * List 인터페이스와 Set 인터페이스를 구현한 모든 클래스의 인스턴스가 매개변수로 가능하다.
 *
 * ArrayList(Collection<? extends E> c)
 * LinkedList(Collection<? extends E> c)
 * Vector(Collection<? extends E> c)
 * HashSet(Collection<? extends E> c)
 * TreeSet(Collection<? extends E> c)
 * LinkedHashSet(Collection<? extends E> c)
 */
