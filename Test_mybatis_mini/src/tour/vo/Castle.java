package tour.vo;


public class Castle extends TourArea {
	
	private int birth;
	private String king;
	
	public Castle() {
	}



	public Castle(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int language,
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
		return  "��"+super.toString()+" �����⵵�� " + birth +"�̸�"+ " �׽ô� ���� " + king +" �Դϴ�.";
	}
	
	
	
	
	


	
}
