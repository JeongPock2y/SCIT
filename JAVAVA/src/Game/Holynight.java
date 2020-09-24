package Game;

public class Holynight extends Knight implements Healer {

	public Holynight(String name, int hp, int armor) {
		super(name, hp, armor);
		// TODO Auto-generated constructor stub
	}

	public void healingAura() {
		System.out.printf("[%s]healingAura()시전\n ", name);
		System.out.printf("체력증");
	}

	public void holyArmor() {
		System.out.printf("[%s]holyArmor시전 \n", name);
		System.out.printf("뎀지-10");
	}
}
