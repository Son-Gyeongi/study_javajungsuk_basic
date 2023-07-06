package ch13;

public class Practice13_1 {
    public static void main(String[] args) {
        // Thread 클래스로부터 상속
        Thread1 th1 = new Thread1();
        th1.start();

        // Runnable 인터페이스를 구현
        Runnable r = new Thread1_1();
        Thread th2 = new Thread(r); // 생성자 Thread(Runnable target)

        th2.start();
    }
}

// Thread 클래스로부터 상속
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}

// Runnable 인터페이스를 구현
class Thread1_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('|');
        }
    }
}
