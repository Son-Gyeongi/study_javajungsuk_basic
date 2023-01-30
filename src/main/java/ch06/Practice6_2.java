package ch06;

// 문제 6_2
class Student6_2 {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    // 기본생성자
    Student6_2() {}

    // 생성자
    Student6_2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        int sum;
        double avg;
        sum = kor + eng + math;
        avg = sum/3.0;
        System.out.println(avg);

        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + Math.round(avg*10)/10.0;
    }
}

public class Practice6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 75);

        String str = s.info();
        System.out.println(str);
    }
}
