package tourarea.vo;

public class TourArea {

	// ���� �̸�
	private String name;
	// �����
	private int fee;
	// ���½ð�
	private int starttime;
	// ����ð�
	private int closetime;
	// ��ȣ��
	private int subwayline;
	// ����
	private Boolean parking;
	// 언어선택 추가
	private int language;

	public TourArea() {
		super();
	}

	public TourArea(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int language) {
		super();
		this.name = name;
		this.fee = fee;
		this.starttime = starttime;
		this.closetime = closetime;
		this.subwayline = subwayline;
		this.parking = parking;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getClosetime() {
		return closetime;
	}

	public void setClosetime(int closetime) {
		this.closetime = closetime;
	}

	public int getSubwayline() {
		return subwayline;
	}

	public void setSubwayline(int subwayline) {
		this.subwayline = subwayline;
	}

	public Boolean getparking() {
		return parking;
	}

	public void setparking(Boolean parking) {
		this.parking = parking;
	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	@Override
	public String toString() {
		String park = null;
		if (parking) {
			park = "가능";
		} else {
			park = "불가능";
		}
		return " 이름은 " + name + " 이며" + " 입장료는 " + fee + "원 입니다" + " 운영시간은 " + starttime + "시부터" + closetime + "시 까지며"
				+ "\n 지하철은 " + subwayline + "호선이고" + " 주차는 " + park + "합니다.";
	}

}
