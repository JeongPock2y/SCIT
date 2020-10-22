package global.sesoc.baseball.vo;

/**
 * ���� ���� VO Ŭ�������� ���� Ŭ����
 */
public abstract class Player {
	/**
	 * ���� ���� ��ȣ
	 */
	private String id;
	/**
	 * ���� �̸�
	 */
	private String name;
	/**
	 * �Ҽ� �� ����
	 */
	private String team;
	/**
	 * ����
	 */
	private int salary;
	/**
	 * WAR
	 */
	private double war;

	public Player() {

	}

	public Player(String id, String name, String team, int salary, double war) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.salary = salary;
		this.war = war;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getWar() {
		return war;
	}

	public void setWar(double war) {
		this.war = war;
	}

	@Override
	public String toString() {
		return "[ID=" + id + ", �̸�=" + name + ", �Ҽ���=" + team + ", ����=" + salary + ", war=" + war + "]";
	}

}
