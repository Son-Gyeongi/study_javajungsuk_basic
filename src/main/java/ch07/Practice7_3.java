package ch07;

class Product7_3 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product7_3() {} // Product 클래스에 기본생성자가 있어야 한다.

    Product7_3(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv7_3 extends Product7_3 {
    Tv7_3() {}

    public String toString() {
        return "Tv7_3";
    }
}

public class Practice7_3 {
    public static void main(String[] args) {
        Tv7_3 t = new Tv7_3();
    }
}
