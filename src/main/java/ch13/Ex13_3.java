package ch13;

public class Ex13_3 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx3_1 th1 = new ThreadEx3_1();
        th1.start();
        startTime = System.currentTimeMillis();

        // main쓰레드에서 작업 A 수행
        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1 : " + (System.currentTimeMillis() - Ex13_3.startTime));

    }
}

// 작업 B
class ThreadEx3_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2 : " + (System.currentTimeMillis() - Ex13_3.startTime));
    }
}
