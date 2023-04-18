package ch09;

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
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

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
