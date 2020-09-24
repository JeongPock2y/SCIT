package JAVA0924;

public class ErrorTest {

	public static void main(String[] args) {
		int i =2;
		int j =0;
		System.out.println("start");
		try {
			
			System.out.println(i/j);//문법 적으론 ㅇㅋ が 실행시에러
		} catch (Exception e) {
			System.out.println("창원이형은 여자랑 놀...ㄱ!");
			System.out.println("예외 캐치 : "+e.getMessage());
		}finally {
			
		}
		System.out.println("종료");
	}

}
