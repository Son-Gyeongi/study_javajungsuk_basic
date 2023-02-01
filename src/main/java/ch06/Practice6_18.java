package ch06;

public class Practice6_18 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals(""))
            return false;
        else {
            for (int i=0; i < str.length() ; i++) {
                if (('a'<=str.charAt(i) && str.charAt(i)<='z')
                        || ('A'<=str.charAt(i) && str.charAt(i)<='Z'))
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "123o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
