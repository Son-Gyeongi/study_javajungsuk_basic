package ch07;

class Product7_3 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product7_3(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv7 extends Product7_3 {
    Tv7() {}

    public String toString() {
        return "Tv";
    }
}

public class Practice7_3 {
    public static void main(String[] args) {
        Tv7 t = new Tv7();
    }
}
