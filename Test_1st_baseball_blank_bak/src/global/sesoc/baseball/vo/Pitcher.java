package global.sesoc.baseball.vo;

/**
 * ���� ���� VO
 */
public class Pitcher extends Player {

	/**
	 * ��� ��å
	 */
	private double era;
	/**
	 * �̴�
	 */
	private int inning;
	/**
	 * ��
	 */
	private int wins;
	/**
	 * ��
	 */
	private int losses;
	/**
	 * ���̺�
	 */
	private int save;
	/**
	 * Ȧ��
	 */
	private int hold;

	public Pitcher() {

	}

	public Pitcher(String id, String name, String team, int salary, double war, double era, int inning, int wins,
			int losses, int save, int hold) {
		super(id, name, team, salary, war);
		this.era = era;
		this.inning = inning;
		this.wins = wins;
		this.losses = losses;
		this.save = save;
		this.hold = hold;
	}
//
//	@Override
//	public String toString() {
//		return "Pitcher [era=" + era + ", inning=" + inning + ", wins=" + wins + ", losses=" + losses + ", save=" + save
//				+ ", hold=" + hold + "]";
//	}

	@Override
	public String toString() {
		return super.toString() + "Pitcher [era=" + era + ", inning=" + inning + ", wins=" + wins + ", losses=" + losses
				+ ", save=" + save + ", hold=" + hold;

	}

}
