package ch13;

import java.util.ArrayList;

class Customer implements Runnable {
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            if (eatFood()) // 음식을 소비
                System.out.println(name + " ate a " + food);
            else
                System.out.println(name+" failed to eat. : (");
        }
    }

    boolean eatFood() {
        return table.remove(food); // 테이블에서 음식(dish)을 제거
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 하나 선택해서 table에 추가한다.
            int idx = (int) (Math.random() * table.dishName());
            table.add(table.dishNames[idx]); // 요리가는 table에 음식(dish)을 추가하는 일을 한다.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        } // while
    }
}

class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    /**
     * Table을 여러 쓰레드가 공유하기 때문에 작업 중에 끼어들기 발생할 수 있으므로
     * -> Table의 add()와 remove()를 synchronized로 동기화
     * (Arraylist는 동기화가 안되어서 Arraylist인 dishes를 건드리는 메서드를 다 동기화한다.)
     */

    public synchronized void add(String dish) { // synchronized를 추가
        // 테이블이 가득찼으면, 음식을 추가 안함
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            while (dishes.size() == 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }

            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
        } // synchronized

        return false;
    }

    public int dishName() {
        return dishNames.length;
    }
}

public class Ex13_14 {
    public static void main(String[] args) throws Exception {
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
