package ch12;

import java.util.HashMap;

public class Ex12_2_HashMap {
    public static void main(String[] args) {
        // JDK1.7부터 생성자 <String, Student1> 타입지정 생략 가능
        HashMap<String, Student1> map = new HashMap<>();
        // map에 객체 저장
        map.put("자바왕", new Student1("자바왕", 1, 1, 100, 100, 100));

        // map에서 꺼내기
        Student1 s = map.get("자바왕");

        System.out.println(map);
        System.out.println(map.get("자바왕").name);
    } // main
}

class Student1 {
    String name = "";
    int ban; // 반
    int no; // 번호
    int kor;
    int eng;
    int math;

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
