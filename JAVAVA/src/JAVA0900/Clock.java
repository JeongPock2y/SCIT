package JAVA0900;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;//awt 배치관리자들 !!
import java.time.LocalTime;

import javax.swing.JFrame;//awt 컴포넌트와 구분하기위해 J대문자로 시작됨
import javax.swing.JLabel;
import javax.swing.JPanel;
//두번째 방법은 JFrame을 상속받아 새로운 프레임 클래스를 작성하는 방법이에요.
public class Clock extends JFrame{
	
	private JLabel laTime;
	private JPanel paTime;
	
	public Clock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		Container c = getContentPane();
		
		laTime = new JLabel("14:04:05");
		laTime.setBounds(50, 10, 170, 54);
		laTime.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		paTime = new JPanel();
		paTime.setBounds(12, 79, 260, 76);
		paTime.setBackground(Color.WHITE);
		paTime.setLayout(null);
		paTime.add(laTime);
		setSize(300, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		c.add(paTime);
		
		Thread t1 = new Thread(new TimerThread());
		t1.start();
		setVisible(true);
	}
	
	class TimerThread implements Runnable {
		@Override
		public void run() {
			// 시간이 변하게 하기
			while(true) {
				String currentTime = LocalTime.now().toString();
				currentTime = currentTime.split("[.]")[0];
				try {
					Thread.sleep(1000);
					laTime.setText(currentTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Clock();
	}
}


