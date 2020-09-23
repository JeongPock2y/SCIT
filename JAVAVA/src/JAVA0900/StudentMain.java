package JAVA0900;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//사용자로 부터 입력받기 위한 Scanner 객체
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("[ 학생 정보 입력 ]");
		
		//사용자로 부터 학생 이름을 입력 받음.
		System.out.print("학생 이름 : ");
		student.setName(sc.nextLine());
		
		//사용자로 부터 국어 점수를 입력 받음.
		System.out.print("국어 점수 : ");
		student.setKor(sc.nextInt());
		
		//사용자로 부터 영어 점수를 입력 받음.
		System.out.print("영어 점수 : ");
		student.setEng(sc.nextInt());
		
		//사용자로 부터 수학 점수를 입력 받음.
		System.out.print("수학 점수 : ");
		student.setMat(sc.nextInt());
		
		
		System.out.println(student.getName()+"님의 총점은"+student.getTotal()+"점 이고"+
							"평균은"+student.getAverage()+"점 입니다.");
		
		//입력받은 정보를 저장할 Student 객체 생성
		//코드를 작성하시오.
		
		//입력받은 학생 이름을 생성한 Student 객체에 저장하는 메소드 호출
		//코드를 작성하시오.
		//입력받은 국어 점수를 생성한 Student 객체에 저장하는 메소드 호출
		//코드를 작성하시오.
		//입력받은 영어 점수를 생성한 Student 객체에 저장하는 메소드 호출
		//코드를 작성하시오.
		//입력받은 수학 점수를 생성한 Student 객체에 저장하는 메소드 호출
		//코드를 작성하시오.
		
		//Student 객체에 저장된 이름과 총점, 평균을 출력
		//코드를 작성하시오.
	}

}