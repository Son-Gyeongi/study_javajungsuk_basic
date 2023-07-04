package ch13;

// synchronized 적용 후
public class Ex13_13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}

class Account2 {
    // 잔고(balance)
    private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

    // 읽을 떄도 synchronized 동기화 해주면 좋다.
    public synchronized int getBalance() {
        return balance;
    }

    // 출금(withdraw)
    // 임계영역 (한번에 한 쓰레드만 사용가능)
    public synchronized void withdraw(int money) { // synchronized로 메서드를 동기화
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
}

class RunnableEx13 implements Runnable {
    Account2 acc = new Account2();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withdraw)
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    } // run()
}
