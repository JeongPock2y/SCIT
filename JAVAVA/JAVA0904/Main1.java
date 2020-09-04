package JAVA0904;

public class Main1 {
	
	public static void main(String[] args) {
		
		int book = 300000;
		int cp = 60; //한커플이 하루에 60권씩 
		int day=1;//읽은 날
		
		
		while(true) {
			book -= cp;
			if(day%10==0) {
				cp*=2;	
			}
			if(book<=0) {
				System.out.println("책을 다 읽을 때까지 "+day+"일"+cp/30+"명 입니다");
				break;
			}
			day++;
		}

	}
}
			


