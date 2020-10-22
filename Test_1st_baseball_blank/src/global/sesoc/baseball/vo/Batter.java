package global.sesoc.baseball.vo;

/**
 * 타자 정보 VO
 */
public class Batter extends Player {

	/**
	 * 타율
	 */
	private double average;
	/**
	 * 타수
	 */
	private int atbat;
	/**
	 * 타점
	 */
	private int rbi;
	/**
	 * 득점
	 */
	private int score;

	public Batter() {

	}

//부모의것까지 입력받을수있게
	public Batter(String id, String name, String team, int salary, double war, double average, int atbat, int rbi,
			int score) {
		super(id, name, team, salary, war);
		this.average = average;
		this.atbat = atbat;
		this.rbi = rbi;
		this.score = score;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getAtbat() {
		return atbat;
	}

	public void setAtbat(int atbat) {
		this.atbat = atbat;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return super.toString() + "Batter [average=" + average + ", atbat=" + atbat + ", rbi=" + rbi + ", score="
				+ score;

	}
}
