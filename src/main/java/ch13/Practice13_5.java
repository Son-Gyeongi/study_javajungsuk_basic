package ch13;

public class Practice13_5 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try {
            Thread.sleep(6 * 1000);
        } catch (Exception e) {}

        stopped = true; // 쓰레드를 정지시킨다.
        th1.interrupt(); // 일시정지 상태에 있는 쓰레드를 꺠운다.
        System.out.println("stopped");
    }
}

class Thread5 extends Thread {
    @Override
    public void run() {
        // Practice13_5.stopped의 값이 false인 동안 반복한다.
        for (int i = 0; !Practice13_5.stopped; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3 * 1000); // 3초간 쉰다.
            } catch (Exception e) {}
        }
    } // run()
}

/**
 * 정답
 * Practice13_5.stopped의 값이 바뀌어도 for문 내의 Thread.sleep(3*1000);
 * 문장에의해 일시정지 상태에 있는 경우, 시간이 지나서 일시정지 상태를 벗어날 때까지
 * for문을 벗어날 수 없기 때문에 이런 현상이 발생한다.
 * 그래서 interrupt()를 호출해서 자고 있는 (sleep()에 의해 일시정지 상태에 있는)
 * 쓰레드를 깨워야 즉시 정지하게 된다.
 */
/**
 *  해설
 *  쓰레드 th1은 아래의 반복문을 수행하다가 main메서드에서 Practice13_5.stopped의 값을 true로 바꾸면
 *  반복문을 빠져나와 수행을 종료하게 된다.
 *  반복문 안에 쓰레드를 3초 동안 일시정지 상태로 하는 'Thread.sleep(3*1000)'이 있기 떄문에
 *  Practice13_5.stopped의 값이 바뀌었다 하더라도 일시정지 상태에 있다면,
 *  일시정지 상태가 끝나야만 반복문을 빠져나오게 된다.
 *
 *  그래서 쓰레드의 실행을 바로 종료시키려면 Practice13_5.stopped의 값을 true로 바꾸는 것만으로는 부족하다.
 *  그 외에 다른 방법이 더 필요하다. 그것은 바로 interrupt()를 호출하는 것이다.
 *  interrupt()는 InterruptedException을 발생시킴으로써 Thread.sleep()에 의해 일시정지 상태에 있던
 *  쓰레드를 즉시 깨운다.
 *  그래서 Practice13_5.stopped의 값을 true로 바꾸고, interrupt()를 호출하면 지연 없이
 *  즉시 쓰레드를 멈추게 할 수 있다.
 */
