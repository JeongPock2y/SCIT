package student.vo;

/**
 * ���� ������ ������ VO Ŭ����
 */
public class Student extends PersonVO{
	private String id;				//�й�
	private String name;			//�̸�
	private int kor;				//��������
	private int eng;				//��������
	private int mat;				//��������
	private double avg;				//�������
	
	public Student() {
		int a = 10;
		System.out.println(10);
	}

	
	public Student(String id, String name, int kor, int eng, int mat) {
		
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public double getAvg() {
		avg= ((kor+eng+mat)/3.0);
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		
		
		
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avg="
				+ avg + "]";
	}
	

	
}
