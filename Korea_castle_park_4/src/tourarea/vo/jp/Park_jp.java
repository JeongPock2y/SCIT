package tourarea.vo.jp;

//공원
public class Park_jp extends TourArea_jp{
	//위치
	private String location;
	//관리실 개수
	private int manageoffice;
	
	public Park_jp(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, String location,
			int manageoffice) {
		super(name, fee, starttime, closetime, subwayline, parking);
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
		return "公園"+super.toString()+" の場所は " + location + " で"+" 管理室の個数は " + manageoffice + " 個です。]";
	}
	


	
	


	}