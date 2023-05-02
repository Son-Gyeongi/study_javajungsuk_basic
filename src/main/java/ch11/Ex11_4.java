package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                // 화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // trim() - 문자열 앞뒤 공백 제거

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); // 프로그램 정상 종료
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    // 입력받은 명령어를 저장하고,
                    save(input);

                    // LinkedList의 내용을 보여준다.
                    LinkedList list = (LinkedList) q;
//                    ListIterator it = list.listIterator(); // ListIterator 잘 사용하지 않는다.
//
//                    while (it.hasNext())
//                        System.out.println(++i + "." + it.next());

                    /** for (int j = 0; j < tmp.size(); j++)
                     * tmp.size() 이 부분에서 반복문 돌 때마다 계속 호출한다.
                     * 반복문 도는 동안 사이즈 값이 변하지 않는다.
                     * => 상수값으로 바꿔주자
                     */
                    final int SIZE = list.size(); // 상수로 사이즈 한번만 알아내고 계속 쓴다.
                    for (int j = 0; j < SIZE; j++) // for (int j = 0; j < tmp.size(); j++)
                        System.out.println((j+1)+"."+list.get(j));
                } else {
                    save(input);
                    System.out.println(input);
                } // if (input.equalsIgnoreCase("q")) {
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        } // while(true)
    } // main()

    public static void save(String input) {
        // queue에 저장한다.
        if (!"".equals(input)) // if(input != null && !input.equals(""))와 같다.
            // input != null 이 부분을 줄이기 위해서 ""따옴표가 먼저 왔다.
            q.offer(input); // 큐에 명령어를 저장

        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if (q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
            q.remove(); // poll()이랑 같다.
    }
} // end of class
