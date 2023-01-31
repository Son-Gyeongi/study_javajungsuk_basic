package ch06;

class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력

    /*
        weapon, armor - 모든 Marine인스턴스에 대해 동일한 값이어야 한다.
        weaponUp(), armorUp() - static 변수에 대한 작업을 하는 메서드
    */

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}

public class Practice6_7 {

}
