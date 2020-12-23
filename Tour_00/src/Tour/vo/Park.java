package Tour.vo;

public class Park extends TourArea{
	private String location;
	private int manageOffice;
	
	
	
	public Park() {
		
	}
	public Park(String area_name, int fee, int starttime, int closetime, int subwayLine,String location, int manageOffice) 
	{
		super(area_name, fee, starttime, closetime, subwayLine);
		this.location = location;
		this.manageOffice = manageOffice;
	}
	
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getManageOffice() {
		return manageOffice;
	}

	public void setManageOffice(int manageOffice) {
		this.manageOffice = manageOffice;
	}

	@Override
	public String toString() {
		return "공원"+super.toString()+"장소는 " + location + " 이며"+"관리실의 개수는 " + manageOffice + " 개 입니다.]";
	}
	
	}
	


	
	


	