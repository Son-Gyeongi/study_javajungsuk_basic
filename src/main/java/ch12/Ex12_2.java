package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

//        Iterator it = list.iterator();
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            // it.next()가 Object를 반환
            // 지네릭스를 사용하지 않으면 형변환 필요
//            Student s = (Student) it.next();
//            Student s = it.next(); // it.next()가 Student를 반환
//            System.out.println(s.name);
            System.out.println(it.next().name); // 코드가 더 간결해질 수 있다.
        }
    } // main
}

class Student {
    String name = "";
    int ban; // 반
    int no; // 번호

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
