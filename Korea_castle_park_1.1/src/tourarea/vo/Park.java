package tourarea.vo;

//����
public class Park extends TourArea{
	//��ġ
	private String location;
	//������ ����
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