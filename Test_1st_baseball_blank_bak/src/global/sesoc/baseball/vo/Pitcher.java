package global.sesoc.baseball.vo;

/**
 * Åõ¼ö Á¤º¸ VO
 */
public class Pitcher extends Player {

	/**
	 * Æò±Õ ÀÚÃ¥
	 */
	private double era;
	/**
	 * ÀÌ´×
	 */
	private int inning;
	/**
	 * ½Â
	 */
	private int wins;
	/**
	 * ÆÐ
	 */
	private int losses;
	/**
	 * ¼¼ÀÌºê
	 */
	private int save;
	/**
	 * È¦µå
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
