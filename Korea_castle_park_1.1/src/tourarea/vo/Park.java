package tourarea.vo;

//공원
public class Park extends TourArea{
	//위치
	private String location;
	//관리실 개수
	private int manageoffice;
	
	public Park(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking, String location,
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
		return super.toString()+"Park [location=" + location + ", manageoffice=" + manageoffice + "]";
	}
	


	
	


	}