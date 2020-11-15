package tourarea.vo;




public abstract class TourArea  {
	

	private String name;
	//�����
	private int  fee;
	//���½ð�
	private int starttime;
	//����ð�
	private int closetime;
	//��ȣ��
	private int  subwayline;
	//����
	private Boolean parking;
	
	public TourArea() {
		
	}
	public TourArea(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking) {
		super();
		this.name = name;
		this.fee = fee;
		this.starttime = starttime;
		this.closetime = closetime;
		this.subwayline = subwayline;
		this.parking = parking;
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
	@Override
	public String toString() {
		String park =  null;
		if (parking) {
			park ="Y";
		}else {
			park ="N";
		}
		return " [name=" + name + ", fee=" + fee + ", starttime=" + starttime + ", closetime=" + closetime
				+ ", subwayline=" + subwayline + ", parking=" + park + "]";
	}
	
}
