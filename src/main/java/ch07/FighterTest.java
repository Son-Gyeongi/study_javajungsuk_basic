package ch07;

// 추상클래스
abstract class Unit2 {
    int x,y;
    abstract void move(int x, int y); // x,y 좌표로 움직이는 move메서드
    void stop() {
        System.out.println("멈춥니다");
    }
}

// 예외업이 인터페이스의 모든 메서드는 public abstract이다.
interface Fightable {
    void move(int x, int y); // public abstract가 생략됨
    void attack(Fightable f); // public abstract가 생략됨
}

// Fightable을 구현하고 Unit2를 상속받는 클래스
class Fighter extends Unit2 implements Fightable {

    // 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다. (넓거나 같아야함)
    // 메서드에 아무것도 안 붙이면 default인데 public보다 범위가 좁다.
    // 그래서 메서드에 public을 붙여야한다.
    @Override
    public void move(int x, int y) {
        System.out.println("[ x="+x+", y="+y+" 로 이동]");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter(); // Fighter를 생성해서 반환
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter get = new Fighter();
        get.getFightable();

//        Fighter f = new Fighter();
        Unit2 u = new Fighter(); // 추상클래스와 다형성
        Fightable f = new Fighter(); // 인터페이스와 다형성

        u.move(100,200);
//        u.attack(new Fighter()); Unit2에는 attack()메서드가 없어서 호출불가
        u.stop();

        f.move(100,200);
        f.attack(new Fighter());
//        f.stop(); Fightable에는 stop()이 없어서 호출불가
    }
}
