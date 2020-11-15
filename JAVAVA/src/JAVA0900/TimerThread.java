package JAVA0900;
import javax.swing.*;
import javax.swing.event.*;
 
import java.awt.*;
import java.awt.event.*;
 
class TimerThread extends Thread{
    JLabel timerLabel;                                //타이머 값이 출력된 레이블
   
    public TimerThread(JLabel timerLabel){            // 생성자
        this.timerLabel = timerLabel;               // 레이블 컴포넌트를 받아서 기억
    }
   
    //스레드 코드
    //run()이 종료하면 스레드 종료
    public void run(){
        int n=0;     // 타이머 카운트 값
        while(true){  //  무한루프
            timerLabel.setText(Integer.toString(n));    // 타이머 값을 레이블에 출력
            n++;      // 카운트 증가
            try{
                Thread.sleep(1000);    // 1초 동안 잠을 잔다.
            }catch(InterruptedException e){return;}        // 예외가 발생하면 스레드 종료
        }
    }

	
   
}
 
 
