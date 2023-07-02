package ch13;

import javax.swing.*;

public class Ex13_4 {
    public static void main(String[] args) {
        // 작업 A
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        // 작업 B
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1초간 시간을 지연한다.
            } catch (Exception e) {}
        }
    }
}
