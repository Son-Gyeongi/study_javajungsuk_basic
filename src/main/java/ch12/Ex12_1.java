package ch12;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv1 extends Product {}
class Audio1 extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv1> tvList = new ArrayList<Tv1>();
//        ArrayList<Product> tvList = new ArrayList<Tv1>(); // 에러.
//        List<Tv1> tvList = new ArrayList<Tv1>(); // OK. 다형성

        productList.add(new Tv1()); // public boolean add(Product e) {
        productList.add(new Audio1()); // Product 그 자손들 OK

        tvList.add(new Tv1()); // public boolean add(Tv e) {
        tvList.add(new Tv1());
//        tvList.add(new Audio1()); // 에러

        printAll(productList);
//        printAll((tvList)); // 컴파일 에러가 발생한다.
    }

    public static void printAll(ArrayList<Product> list) { // new ArrayList<Tv>();를 넣을 수 없다.
        // 참조변수에 대입된 타입 Product랑 생성자에 대입된 타입이 일치해야 한다.
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
