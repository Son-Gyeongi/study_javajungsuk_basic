package ch06;

public class Practice6_16 {
    public static void change(String str) {
        str += "456"; // 기존의 문자열에 "456"을 붙인다.
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str); // change를 호출하면서 문자열 str을 넘겨준다.
        System.out.println("After change: " + str);
    }
}
