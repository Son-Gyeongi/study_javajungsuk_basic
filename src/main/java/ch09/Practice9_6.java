package ch09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice9_6 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();

            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0); // 프로그램 정상종료
            }

            /**
             * 힌트 Pattern, Matcher클래스 사용할 것
             * Pattern 정규 표현식을 저장하기 위한 클래스다.
             */
            // 패턴 만들기
            Pattern p = Pattern.compile(input);
            // 패턴에 맞게 문자열 찾기
            for (String value : phoneNumArr) {
                Matcher m = p.matcher(value);
                if (m.find()) {
                    list.add(value);
                } else {
                    continue;
                }
            }

            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        } // main
    }
}
