package Tour.vo;

//게시판 글 정보 VO
public class TourArea {
	private String area_name;
	private int fee;
	private int starttime;
	private int closetime;
	private int subwayLine;

	public TourArea() {

	}

	public TourArea(String area_name, int fee, int starttime, int closetime, int subwayLine) {
		this.area_name = area_name;
		this.fee = fee;
		this.starttime = starttime;
		this.closetime = closetime;
		this.subwayLine = subwayLine;

	}

	public String getarea_name() {
		return area_name;
	}

	public void setarea_name(String area_name) {
		this.area_name = area_name;
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

	public int getSubwayLine() {
		return subwayLine;
	}

	public void setSubwayLine(int subwayLine) {
		this.subwayLine = subwayLine;
	}


	@Override
	public String toString() {
		return "TourArea [area_name=" + area_name + ", fee=" + fee + ", starttime=" 
				+ starttime + ", closetime=" + closetime + "]";
	}

}
