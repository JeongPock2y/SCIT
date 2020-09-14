package JAVA0904;

public class Main1ForVersion {

	public static void main(String[] args) {
		int books =300000;
		int people=2;
		int day=1;
		
		for(day= 1; books<0; day++) {
			books -= day*people*30;
			if(day%10==0) {
				people*=2;
			}
			
		}
		System.out.print("책을다 읽을때까지"+day+ "일"+people+"명 남았습니다");
		
	}

}
