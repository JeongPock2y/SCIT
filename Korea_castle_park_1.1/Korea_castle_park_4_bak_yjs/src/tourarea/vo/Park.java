package tourarea.vo;

//����
public class Park extends TourArea {
	// ��ġ
	private String location;
	// ������ ����
	private int manageoffice;

	public Park() {
		super();
	}

	public Park(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, int language,
			String location, int manageoffice) {
		super(name, fee, starttime, closetime, subwayline, parking, language);
		this.location = location;
		this.manageoffice = manageoffice;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getManageoffice() {
		return manageoffice;
	}

	public void setManageoffice(int manageoffice) {
		this.manageoffice = manageoffice;
	}

	@Override
	public String toString() {
		return "공원" + super.toString() + "장소는 " + location + " 이며" + "관리실의 개수는 " + manageoffice + " 개 입니다.]";
	}

}