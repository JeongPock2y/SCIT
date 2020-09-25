package JAVA0925;

public class SquareSize {
	public static void main(String[] args) {
		//객체생성
		Square s = new Square();
		s.length=4;
		System.out.printf("한변의 길이가 %d인 정사각형의 "
				+ "넓이는 :%d",s.length,s.area());
	}
}
