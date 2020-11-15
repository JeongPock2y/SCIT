package tourarea.vo;

//����
public class Castle extends TourArea {
	//������ ����
	private int birth;
	//�ô� ��
	private String king;
	
	public Castle() {
		// TODO Auto-generated constructor stub
	}

	public Castle(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, String language,
			int birth, String king) {
		super(name, fee, starttime, closetime, subwayline, parking, language);
		this.birth = birth;
		this.king = king;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

	@Override
	public String toString() {
		return  "성"+super.toString()+" 생성년도는 " + birth +"이며"+ " 그시대 왕은 " + king +" 입니다.";
	}
	
	
	
	
	


	
}
