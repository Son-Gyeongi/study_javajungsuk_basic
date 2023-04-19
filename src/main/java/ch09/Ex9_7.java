package ch09;

public class Ex9_7 {
    public static void main(String[] args) {
        /**
         * String은 불변, 내용 변경 불가
         * 내용을 바꿀 수 없어서 여러 참조변수가 하나의 String객체를 공유
         * 같은 내용의 문자열 리터럴(상수)은 하나만 만들어진다.
         */
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
    }
}
