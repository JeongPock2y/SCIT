package Tour.vo;

public class Castle extends TourArea {
	private int birth;
	private String king;
	
	public Castle() {
	}
	

	public Castle(String area_name, int fee, int starttime, int closetime, int subwayLine
			,int birth, String king) {
		super(area_name, fee, starttime, closetime, subwayLine);
		this.birth = birth;
		this.king = king;
	}


	public Castle(int birth, String king) {
		super();
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
