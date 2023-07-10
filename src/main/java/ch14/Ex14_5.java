package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

/* 스트림의 중간연산 - Comparator의 메서드 / comparing() */
public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        );

//        studentStream.sorted(Comparator.comparing(Student::getBan).reversed() // 1. 반별 정렬 , 메서드 참조
        studentStream.sorted(Comparator.comparing((Student s)->s.getBan()).reversed() // 1. 반별 정렬, 람다식
                // 람다식. getBan()가 static메서드가 아니라서 앞에 참조변수가 와야함. 참조변수.getBan()
                        .thenComparing(Comparator.naturalOrder()).reversed()) // 2. 기본 정렬
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }

    // 총점 내림차순을 기본 정렬로 한다.
    @Override
    public int compareTo(Student s) {
        return s.totalScore-this.totalScore;
    }
}
