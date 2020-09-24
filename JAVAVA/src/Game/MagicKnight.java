package Game;

public class MagicKnight extends Knight implements Sorcerer  {

	public MagicKnight(String name, int hp, int armor) {
		super(name, hp, armor);
		// TODO Auto-generated constructor stub
	}
	public void fireArmor() {
		System.out.printf("[%s]fireArmor()시전\n ", name);
		System.out.printf("초당");
	
	}
	public void thunderBlade() {
		System.out.printf("[%s]thunderblade()시전 \n", name);
		System.out.printf("추가10");

}
}
