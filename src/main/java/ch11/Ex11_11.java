package ch11;

import java.util.HashSet;
import java.util.Objects;

/**
 * 우리가 만든 클래스(Person)를 HashSet에 저장하려면
 * 반드시 equals()와 hashCode()가 오버라이딩 되어있어야 한다.
 */
public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc"); // 중복이라 저장안됨.
        /**
         * equals()와 hashCode()를 오버라이딩 안해서
         * 2개 객체 다르다고 나온다.
         * equals()와 hashCode()를 오버라이딩 후에는 중복이 제거된다.
         * equals()와 hashCode()를 이용해서 true가 나와서 중복으로 간주되었다.
         */
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
// 클래스 만들 때 equals()와 hashCode() 2개를 오버라이딩 하는게 정석이다.
class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        // Object 객체가 Person인지 확인
        if (!(obj instanceof Person)) return false;

        // Object 객체에는 name, age라는 멤버가 없다. 그래서 형변환 한다.
        // Person이라는 리모컨에는 멤버가 선언이 되어있다. 그래서 p.name, p.age가 가능하다.
        Person p = (Person) obj; // 형변환

        // name이랑 age가 같은지 비교
        // 나자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        // hash() 선언부
        // int hash(Object... values)
        // Object... 가변인자로 매개변수를 안 넣어도 되고 1개, 2개 등 더 넣어도 된다.
        return Objects.hash(name, age); // Objects 클래스의 hash(iv 다 넣으면 된다.)메서드
        // 객체를 구별하는 기준이 iv이다. iv값이 같으면 같은 객체이다.
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }
}
