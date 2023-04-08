package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 아래와 같은 코드는 AWT(Java의 윈도우 프로그래밍 도구) 작성할 때 많이 쓴다.
public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler()); // 2. new로 객체 생성
    }
}

/**
 * 1회성인데 굳이 클래스를 만드는 건 번거롭다.
 * 한번 쓰고 말건데 익명 클래스로 처리하자 => Ex7_19
 */
class EventHandler implements ActionListener { // 1. 클래스 정의
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
