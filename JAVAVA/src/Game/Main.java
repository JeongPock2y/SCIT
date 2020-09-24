package Game;

public class Main {

	public static void main(String[] args) {
		  Knight uther = new Holynight("우서",200,10);
		  Knight arthas = new MagicKnight("아서스",150,8);
		  
		  uther.increaseHP();
		  uther.increaseArmor();
		  Holynight holyuther = (Holynight) uther;
		  holyuther.healingAura();
		  holyuther.holyArmor();
		  
		  arthas.increaseHP();
		  arthas.increaseArmor();
		  MagicKnight magicArthas = (MagicKnight) arthas;
		  magicArthas.fireArmor();
		  magicArthas.thunderBlade();
	}

}
	interface Tanker{
		public void increaseHP();
		public void increaseArmor();
	}
	interface Healer{
		public void healingAura();
		public void holyArmor();
	}
	interface Sorcerer{
		public void fireArmor();
		public void thunderBlade();
	}
