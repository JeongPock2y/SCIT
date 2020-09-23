package StudentScoreCal;
public class Student {
	
	String name;						//학생 이름
	int kor;								//국어 점수
	int eng;								//영어 점수
	int mat;							//수학 점수
	/*
	 * 메소드 이름 : setName
	 * 파라메타 : 입력받은 학생 이름
	 * 리턴타입 : 없음
	 * 동작 : 입력받은 학생 이름을 Student객체의 학생 이름 멤버변수에 대입하시오.
	 * */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * 메소드 이름 : getName
	 * 파라메타 : 없음
	 * 리턴타입 : 저장된 학생 이름
	 * 동작 : Student객체에 저장된 학생 이름을 반환하시오. 
	 * */
	public String getName() {
		return name;
	}
	/*
	 * 메소드 이름 : setKor
	 * 파라메타 : 입력받은 국어 점수
	 * 리턴타입 : 없음
	 * 동작 : 입력받은 국어 점수를 Student객체의 국어 점수 멤버변수에 대입하시오.
	 * */
	public void setKor(int kor) {
		this.kor= kor;
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	
	/*
	 * 메소드 이름 : setEng
	 * 파라메타 : 입력받은 영어 점수
	 * 리턴타입 : 없음
	 * 동작 : 입력받은 영어 점수를 Student객체의 영어 점수 멤버변수에 대입하시오.
	 * */
	public void setEng(int eng) {
		this.eng=eng;
	}
	
	/*
	 * 메소드 이름 : setMat
	 * 파라메타 : 입력받은 수학 점수
	 * 리턴타입 : 없음
	 * 동작 : 입력받은 수학 점수를 Student객체의 수학 점수 멤버변수에 대입하시오.
	 * */
	public void setMat(int mat) {
		this.mat=mat;
	}
	
	/*
	 * 메소드 이름 : getTotal
	 * 파라메타 : 없음
	 * 리턴타입 : 국어,수학,영어 점수의 합계
	 * 동작 : 입력받은 국어,수학,영어 점수의 합계를 반환하시오.
	 * */
	public int getTotal() {
		return kor+eng+mat;
	}
	/*
	 * 메소드 이름 : getAverage
	 * 파라메타 : 없음
	 * 리턴타입 : 국어,수학,영어 점수의 평균
	 * 동작 : 입력받은 국어,수학,영어 점수의 평균를 반환하시오.
	 * */
	public double getAverage() {
		return getTotal()/3.0;
	}
}