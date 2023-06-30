package ch13;

public class Ex13_1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // 쓰레드 생성

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable r);
        // 위 두 줄을 한 줄로 간단히 Thread t2 = new Thread(new ThreadEx1_2());

        t1.start(); // 쓰레드의 실행
        t2.start();
    }
}

    /**
     * 쓰레드를 구현하는 방법 2가지
     * 둘 다 하는 일이 run()을 완성 하는거다.
     */
class ThreadEx1_1 extends Thread { // 1. Thread 클래스를 상속해서 쓰레드를 구현
    public void run() { // 쓰레드가 수행할 작업
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName()을 호출, 상속받은 메서드
//            System.out.println(this.getName()); // this.getName() 인데 this가 생략 되었다.
        }
    }
}

class ThreadEx1_2 implements Runnable { // 2. Runnable 인터페이스를 구현해서 쓰레드를 구현
    public void run() { // 쓰레드가 수행할 작업
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
