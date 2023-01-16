package ch06;

public class Hello2 { // 소스파일의 이름은 public class이름과 일치
}

class Hello3 {} // 하나의 소스파일에 2개 이상 클래스가 만들어질 수 있다.
public class Hello4 {} // 하나의 소스파일에는 하나의 public class만 허용

// 소스파일 컴파일 하면 2개의 클래스 파일이 생성된다. Hello2.class, Hello3.class
// 가능하면 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직