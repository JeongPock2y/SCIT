package global.sesoc.baseball.vo;

/**
 * Ÿ�� ���� VO
 */
public class Batter extends Player {

	/**
	 * Ÿ��
	 */
	private double average;
	/**
	 * Ÿ��
	 */
	private int atbat;
	/**
	 * Ÿ��
	 */
	private int rbi;
	/**
	 * ����
	 */
	private int score;

	public Batter() {

	}

//�θ��ǰͱ��� �Է¹������ְ�
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
