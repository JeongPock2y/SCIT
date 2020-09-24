package Game;

public class Knight implements Tanker{

protected String name;
protected int hp;
protected int armor;

public Knight(String name, int hp, int armor) {
		this.name = name;
		this.hp = hp;
		this.armor = armor;
	}

	public void increaseArmor() {
		System.out.printf("[%s]increaseArmor시전\n ", name);
		System.out.printf("아머 5증가");
		armor += 5;
	}

	public void increaseHP() {
		System.out.printf("vincreaseHP시전\n ", name);
		System.out.printf("체력100플러스");
		hp += 100;

	}
}
