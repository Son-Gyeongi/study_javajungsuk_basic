package ch13;

/**
 * Thread 클래스에 정의된 suspend(), resume(), stop()은 모두 deprecated 되었다.
 * 그래서 사용을 권장하지 않는다. 대신에 직접 구현해 볼 수 있다.
 */
public class Ex13_10_1 implements Runnable {
    boolean suspended = false; // 일시 정지 상태인가?
    boolean stopped = false; // 쓰레드가 정지 상태인가?

    public void run() {
        while (!suspended) {
            if (!stopped) {
                /*
                쓰레드가 수행할 코드를 작성
                 */
            }
        }
    }

    public void suspend() { suspended = true; }
    public void resume() { suspended = false; }
    public void stop() { stopped = true; }
}
