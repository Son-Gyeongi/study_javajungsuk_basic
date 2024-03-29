package ch09;

public class Practice9_3_answer {
    /**
     * 메서드명 : count
     * 기능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
     * 반환타입 : int
     * 매개변수 : String src, String target
     */
    public static int count(String src, String target) {
        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치

//        반복문을 사용해서 아래의 과정을 반복한다.
        while (true) {
//            1. src에서 target을 pos의 위치부터 찾는다.
            // indexOf()는 지정된 문자열을 찾아서 그 위치를 알려준다.
            pos = src.indexOf(target, pos);

//            2. 찾으면 count의 값을 1 증가 시키고,
//            pos의 값을 target.length만큼 증가시킨다.
            if (pos != -1) {
                count++;
                pos += target.length(); // pos를 찾은 단어 이후로 옮긴다.
            } else {
//                3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
                break;
            }
        }

//        => 반복문 더 간단히
//        while ((pos = src.indexOf(target, pos)) != -1) {
//            count++;
//            pos +=target.length();
//        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
