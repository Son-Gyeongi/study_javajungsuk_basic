package ch07; // Ex7_5PackageTest 클래스가 속할 패키지 선언

public class Ex7_5PackageTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
cmd 창에서 클래스 파일 실행 해보기
C:역슬래시Users 역슬래시user>java ch07.Ex7_5PackageTest
오류: 기본 클래스 ch07.Ex7_5PackageTest을(를) 찾거나 로드할 수 없습니다.

-> 패키지 파일이 있는 상위폴더로 이동
C:역슬래시Users 역슬래시user>cd C:역슬래시Users 역슬래시user 역슬래시workspaceJava 역슬래시study 역슬래시build
역슬래시classes 역슬래시java 역슬래시main

C:역슬래시Users 역슬래시user 역슬래시workspaceJava 역슬래시study 역슬래시build 역슬래시classes
 역슬래시java 역슬래시main>java ch07.Ex7_5PackageTest
Hello World!

C: 역슬래시Users 역슬래시user 역슬래시workspaceJava 역슬래시study 역슬래시build 역슬래시classes 역슬래시java 역슬래시main>
 */