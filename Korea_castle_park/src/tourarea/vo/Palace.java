package tourarea.vo;

//±ÃÀü
public class Palace extends TourArea {
	//Áö¾îÁø ¿¬µµ
	private int birth;
	//½Ã´ë ¿Õ
	private String king;
	
	public Palace() {
		// TODO Auto-generated constructor stub
	}

	public Palace(String name, int fee, int starttime, int closetime, int subwayline, Boolean parikng, int birth,
			String king) {
		super(name, fee, starttime, closetime, subwayline, parikng);
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
