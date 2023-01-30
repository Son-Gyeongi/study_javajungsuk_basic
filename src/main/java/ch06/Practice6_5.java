package ch06;

class PlayingCard {
    int kind; // 인스턴스 변수
    int num; // 인스턴스 변수

    static int width; // 클래스 변수(static변수)
    static int height; // 클래스 변수(static변수)

    PlayingCard(int k, int n) { // k, n 로컬(지역변수)
        kind = k; // 인스턴스 변수 kind, 로컬 변수 k
        num = n; // 인스턴스 변수 num, 로컬 변수 n
    }
}

public class Practice6_5 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}
