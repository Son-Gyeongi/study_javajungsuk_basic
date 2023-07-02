package ch13;

// 쓰레드의 실행제어 - sleep()
public class Ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

//        try {
////            th1.sleep(2000); // th1을 2초동안 잠자게 안된다. 다른 쓰레드를 재울 수는 없다.
//            Thread.sleep(2000); // Thread.sleep();이 바람직
//        } catch (InterruptedException e) {}
        // 예외 처리 메서드 호출
        delay(2 * 1000);

        System.out.print("<<main 종료>>");
    } // main

    // 예외 처리 메서드
    static void delay(long millis) {
        try {
            Thread.sleep(millis); // Thread.sleep();이 바람직
        } catch (InterruptedException e) {}
    }
}

class ThreadEx8_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) System.out.print("-");
        System.out.print("<<th1 종료>>");
    } // run
}

class ThreadEx8_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) System.out.print("|");
        System.out.print("<<th2 종료>>");
    } // run
}
