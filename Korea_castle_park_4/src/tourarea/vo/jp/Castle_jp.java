package tourarea.vo.jp;

//����
public class Castle_jp extends TourArea_jp {
	//������ ����
	private int birth;
	//�ô� ��
	private String king;
	
	public Castle_jp() {
		// TODO Auto-generated constructor stub
	}

	public Castle_jp(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int birth,
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
		return  "城"+super.toString()+" 生成年度は " + birth +"で"+ " その時代の王は " + king +" です。";
	}
	
	
	
	


	
}
