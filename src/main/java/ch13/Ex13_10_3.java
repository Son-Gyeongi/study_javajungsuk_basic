package ch13;

public class Ex13_10_3 {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000); // main쓰레드 중단
            th1.suspend(); // 쓰레드 th1을 잠시 중단시킨다.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
            Thread.sleep(3000);
            th1.stop(); // 쓰레드 th1을 강제종료시킨다.
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {}
    } // main
}

/**
 * Thread 클래스에 정의된 suspend(), resume(), stop()은 모두 deprecated 되었다.
 * 그래서 사용을 권장하지 않는다. 대신에 직접 구현해 볼 수 있다.
 */
class MyThread implements Runnable {
    // volatile 변수값이 쉽게 바뀌는 변수
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    Thread th; // 내부적으로 쓰레드 만든다.

    // 생성자
    MyThread(String name) { // 쓰레드 이름 짓는 생성자
        th = new Thread(this, name); // Thread(Runnable r, String name)
    }

    void start() { // start() 호출하면 내부적으로 선언된 쓰레드를 start
        th.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }

    void resume() {
        suspended = false;
    }

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    } // run()
}
