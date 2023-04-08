package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 아래와 같은 코드는 AWT(Java의 윈도우 프로그래밍 도구) 작성할 때 많이 쓴다.
public class Ex7_19 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() { // 익명 클래스 : 클래스의 정의와 객체 생성을 동시에 한다.
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            } // 익명 클래스의 끝
        });
    } // main의 끝
}
