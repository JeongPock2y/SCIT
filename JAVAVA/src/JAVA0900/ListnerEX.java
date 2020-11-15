package JAVA0900;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListnerEX extends JFrame{
    ListnerEX(){
        this.setTitle("스레드 작성 방법");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
       
        TimerThread th = new TimerThread(timerLabel);        // 타이머 스레드로 사용할 객체 생성
       
        this.add(timerLabel);
       
        setSize(300,150);
        setVisible(true);
       
        th.start();                // 타이머 스레드의 실행을 시작하게 한다.
    }
   
    public static void main(String[] args) {
        new ListnerEX();
 
    }
 
}

