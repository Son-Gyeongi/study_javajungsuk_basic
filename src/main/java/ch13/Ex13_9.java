package ch13;

import javax.swing.*;

// 쓰레드의 실행제어 - interrupt()
public class Ex13_9 {
    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); // interrupt()를 호출하면, interrupted 상태가 true가 된다.
        System.out.println("th1.isInterrupted() = " + th1.isInterrupted()); // true

        // main쓰레드가 interrupt되었는지 확인 
        // interrupted()를 실행한 쓰레드 interrupt() 여부 확인
        // interrupted()는 static메서드로 클래스이름을 붙인다. Thread.interrupted()
        System.out.println("Thread.interrupted() = " + Thread.interrupted()); // false
    }
}

class ThreadEx9_1 extends Thread {
    @Override
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x=0;x<2500000000L;x++); // 시간 지연
        }
        System.out.println("카운트가 종료되었습니다.");
    } // run
}
