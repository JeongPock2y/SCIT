package tourarea.vo;

//궁전
public class Castle extends TourArea {
	//지어진 연도
	private int birth;
	//시대 왕
	private String king;
	
	public Castle() {
		// TODO Auto-generated constructor stub
	}

	public Castle(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int birth,
			String king) {
		super(name, fee, starttime, closetime, subwayline, parking);
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
		return  "궁전"+super.toString()+" 지어진 연도는" + birth +"년(연)이며"+ " 그 시대의 왕은=" + king +" 입니다 .";
	}
	
	
	
	
	


	
}
