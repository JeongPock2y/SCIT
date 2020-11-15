package JAVA0900;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEX extends JFrame {
	ContentPaneEX(){
		setTitle("contentPane 과 JFrame");
		//프레임  제목
		//프레임 꺼지면 원래 화면만꺼지는데 이명령어는 꺼지면 프로그램도 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * 스윙에서는 컨텐트팬(content pane)에만 컴포넌트를 부착할 수 있어요. 
		 * 컨텐트팬은 JFrame 객체가 처음 생길 때 자동으로
		 * 생성되요.
		 */
		Container contentPane = getContentPane();//컨텐츠팬 알아내기
		contentPane.setBackground(Color.ORANGE);//색
		contentPane.setLayout(new FlowLayout());//컨탠츠팬에 FlowLayout라는 배치관리자 달기
		contentPane.add(new JButton("죽는다"));
		contentPane.add(new JButton("다시태어난다"));
		contentPane.add(new JButton("다음생을기약한다"));
		
		setSize(300, 150);
		setVisible(true);//크기 정하고 비저블 을 true로해서 화면 에 띄움
	}
	public static void main(String[] args) {
		new ContentPaneEX();
	}

}
