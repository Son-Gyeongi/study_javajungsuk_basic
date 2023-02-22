package ch07;

class Time {
    private int hour; // 0~23사이의 값을 가져야함
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    // 외부에서는 안 쓰이고 내부에서만 쓰이는 메서드 접근제어자를 private으로 한다.
    // private은 같은 클래스 안에서만 변경 가능
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 24;
    }

    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21); // hour의 값을 21로 변경
        System.out.println(t.getHour());
    }
}
