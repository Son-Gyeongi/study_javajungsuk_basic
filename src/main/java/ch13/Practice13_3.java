package ch13;

public class Practice13_3 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.run();
        /**
         * Thread2클래스의 인스턴스를 생성하긴 했지만,
         * start()가 아닌 run()을 호출함으로써 쓰레드를 실행시킨 것이 아니라
         * 단순히 Thread2클래스의 메서드를 호출한 셈이 되었다.
         * 만일 run()이 아닌 start()를 호출하였다면, 숫자가 섞여서 출력되었을 것이다.
         */

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}
