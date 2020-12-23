package tour.vo;

public class TourArea {

	
	private String name;
	private int fee;
	private int starttime;
	private int closetime;
	private int subwayline;
	private Boolean parking;
	// ���� �߰�
	private int language;

	public TourArea() {
		
	}

	public TourArea(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int language) {
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
			park = "����";
		} else {
			park = "�Ұ���";
		}
		return " �̸��� " + name + " �̸�" + " ������ " + fee + "�� �Դϴ�" + " ��ð��� " + starttime + "�ú���" + closetime + "�� ������"
				+ "\n ����ö�� " + subwayline + "ȣ���̰�" + " ������ " + park + "�մϴ�.";
	}

}
