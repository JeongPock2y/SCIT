package JAVA0926;

public class Main {

	public static void main(String[] args) {
		A a = new B();//부모클래스 인 A을  선언하여서 a변수를 만들고  
		//생성은 B(자식 클래스)로 해줌   
		a.info();//그러면 a.info()가 생성되면서  a를 상속받은 b의  정보가 출력되는데
		//b안에는 a의 정보 는 물론이고 +b의 추가 정보가 있은까 같이 출력됨

	}

}
