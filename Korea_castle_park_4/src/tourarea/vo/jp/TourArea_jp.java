package tourarea.vo.jp;

public abstract class TourArea_jp  {
	
	 //선수 이름 
	private String name;
	//입장료
	private int  fee;
	//오픈시간
	private int starttime;
	//종료시간
	private int closetime;
	//몇호선
	private int  subwayline;
	//주차
	private Boolean parking;
	
	public TourArea_jp() {
		
	}
	public TourArea_jp(String name, int fee, int starttime, int closetime, int subwayline, Boolean parking) {
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
			park ="可能";
		}else {
			park ="不可能";
		}
		return " 名前は " + name +" だし"+ " 入場料は " + fee + "'\'です"+" 運営時間は " + starttime + "時から" + closetime
				+"時までで"+ "\n 地下鉄は " + subwayline +"号線で"+" 駐車は " + park+"です。" ;
	}
	
}
