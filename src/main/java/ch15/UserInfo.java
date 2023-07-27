package ch15;

import java.io.Serializable;

// 직렬화와 역직렬화 예제1
// Ex15_19 예제는 Ex15_20에 사용될 UserInfo클래스의 소스이다.
// 그래서 Ex15_20을 실행하기 전에 Ex15_19를 먼저 컴파일해야 한다.
// javac UserInfo.java -encoding utf-8 <- gitbash에서 실행
public class UserInfo implements Serializable {
    String name;
    String password;
    int age;

    public UserInfo() {
        this("Unknown", "1111", 0);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "(" + name + "," + password + "," + age + ")";
    }
}
