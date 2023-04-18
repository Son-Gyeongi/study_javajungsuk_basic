package ch09;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object클래스의 toString()을 오버라이딩 해보자
    // iv값을 이용해서 문자열을 만든다.
    public String toString() {
        return "kind : " + kind + ", number" + number;
    }

    // Object클래스의 equals()도 오버라이딩 해보자
    public boolean equals(Object obj) {
        // 오버라이딩 할 때는 선언부가 일치해야한다. Object를 써야한다.
        if (!(obj instanceof Card))
            return false;

        Card c = (Card) obj; // obj를 Card로 형변환
        // kind는 스트링이니깐 equals로 비교한다.
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    // equals()를 오버라이딩하면 hashcode()도 오버라이딩 해야한다.
    public int hashCode() {
        // Objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
        return Objects.hash(kind, number); // 가변 인자(매개변수 갯수가 정해져있지 않다)라서 여러개 넣어도 상관없다.
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));
// equals가 true이면 hashCode도 일치하게 만들어야 한다. equals()오버라이딩하면 hashCode()도 오버라이딩 해야한다.
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        /**
         * 결과
         * ch09.Card@2a139a55
         * ch09.Card@15db9742
         * 클래스이름@주소값 가지고 만드는 값
         */
    }
}
