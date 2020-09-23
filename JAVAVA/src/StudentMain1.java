import java.util.Scanner;

public class StudentMain1 {

	public static void main(String[] args) {
		//사용자로 부터 입력받기 위한 Scanner 객체
		Scanner sc = new Scanner(System.in);
		//최대10명의 학생의 정보를 저장할 학생객체 배열 생성
		Student[] sArray = new Student[10];
		//Student student = new Student();
		//입력받은 학생이름 저장할 변수
		String name;
		//입력받은 학생점수 저장할 변수
		int kor,eng,mat;
		//입력받은 메뉴번호
		int menu;
		//배열에 저장된 객체 개수
		int count = 0;
		
		//반복해서 입력받기 위한 반복문
		while(true) {
			//화면에 출력할 메뉴
			System.out.println("=====================");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("=====================");
			//메뉴번호 입력받기
			System.out.print("메뉴를 입력해 주세요 > ");
			menu = sc.nextInt();//여기 값을 비워주기위해서
			
			switch (menu) {
			case 1:
				sc.nextLine();//여기에  이걸써줌
				sArray[count]= new Student();
				System.out.println("[ 학생 정보 입력 ]");
				System.out.print("학생 이름 : ");
				sArray[count].setName(sc.nextLine());
				System.out.print("국어 점수 : ");
				sArray[count].setKor(sc.nextInt());
				System.out.print("영어 점수 : ");
				sArray[count].setEng(sc.nextInt());
				System.out.print("수학 점수 : ");
				sArray[count].setMat(sc.nextInt());
				count++;
				
				break;
			case 2:
				for(int i=0; i< count;i++) {
					System.out.println(sArray[i].getName()+"님의 총점은"+sArray[i].getTotal()+"이고 평균은"+
					sArray[i].getAverage()+"점 입니다.");
				}
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}