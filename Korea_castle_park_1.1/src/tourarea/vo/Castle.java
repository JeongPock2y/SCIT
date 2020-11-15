package tourarea.vo;

//±ÃÀü
public class Castle extends TourArea {
	//Áö¾îÁø ¿¬µµ
	private int birth;
	//½Ã´ë ¿Õ
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
		return super.toString()+"Palace [birth=" + birth + ", king=" + king + "]";
	}
	
	
	
	
	


	
}
