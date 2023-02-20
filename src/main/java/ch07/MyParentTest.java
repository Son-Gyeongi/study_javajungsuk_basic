package ch07;

// 4개의 멤버변수 밖에서 접근 가능한지 테스트
class MyParent {
    private     int prv; // 접근 범위 : 같은 클래스
                int dft; // 접근 범위 : 같은 패키지 // default 는 접근 제어자 안 붙임
    protected   int prt; // 접근 범위 : 같은 패키지 + 자손 클래스(다른 패키지)
    public      int pub; // 접근 범위 : 접근 제한 없음

    public void printMembers() {
        System.out.println(prv); // OK
        System.out.println(dft); // OK
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); // 에러.
        System.out.println(p.dft); // OK
        System.out.println(p.prt); // OK
        System.out.println(p.pub); // OK
    }
}
