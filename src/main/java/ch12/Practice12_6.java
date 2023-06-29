package ch12;

@interface TestInfo12_6 {
    int count() default 1;
    String[] value() default "aaa";
}

// 애너테이션 요소의 규칙
// OK
@TestInfo12_6
//@TestInfo12_6("bbb")
//@TestInfo12_6(count = 1)
//@TestInfo12_6({"bbb", "ccc"})
//@TestInfo12_6(value = {"bbb", "ccc"})

// 에러
//@TestInfo12_6(1) // 요소의 이름이 value가 아닌 경우에는 요소의 이름을 생략할 수 없다.
//@TestInfo12_6("bbb", "ccc") // 요소의 타입이 배열이고, 지정하려는 값이 여러 개인 경우 괄호{}가 필요하다.
public class Practice12_6 {
}
