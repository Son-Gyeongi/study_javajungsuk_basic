package ch07;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i =0 ; i < cards.length; i++) {
            int num = i%10 +1;
            boolean isKwang = (i<10) && ( num==1 || num==3 || num==8);

            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
//            SutdaCard2 temporary = new SutdaCard2();
//            int random = (int)(Math.random()*20);
            int random = (int)(Math.random()*cards.length);
//            temporary = cards[i]; // 임시저장공간
//            cards[i] = cards[random];
//            cards[random] = temporary;
            SutdaCard2 temporary = cards[i]; // 임시저장공간
            cards[i] = cards[random];
            cards[random] = temporary;
        }
    }

    SutdaCard2 pick(int index) { // index - 위치
        // index의 유효성 검사
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard2 pick() {
        // 내가 한 거
//        int random = (int)(Math.random()*20);
//        return cards[random];

        // 정답지
        int index = (int)(Math.random()*cards.length);
        return pick(index); // pick(int index)를 호출한다.
    }
} // SutdaDeck

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Practice7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
