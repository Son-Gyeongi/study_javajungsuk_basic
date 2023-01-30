package ch06;

// 문제 6_3
class Student6_3 {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    // 기본생성자
    Student6_3() {}

    // 생성자
    Student6_3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        int sum = this.getTotal();
        float avg = (float) (sum/3.0);
        return (float) (Math.round(avg*10)/10.0);
    }
}

public class Practice6_3 {
    public static void main(String[] args) {
        Student6_3 s = new Student6_3();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}
