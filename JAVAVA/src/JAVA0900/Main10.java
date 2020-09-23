package JAVA0900;
import java.util.Scanner;

public class Main10 {
//Áã ¼Ò È£¶ûÀÌ Åä³¢ ¿ë ¹ì ¸» ¾ç ¿ø¼þÀÌ ´ß °³ µÅÁö
	public static void main(String[] args) {
		int birth, bir, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("ÅÂ¾î³­ ÇØ¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		birth = sc.nextInt();
		bir = birth % 12;
		switch (bir) {
		case 1:
			System.out.println(birth + "´ß¶ì");
			break;
		case 2:
			System.out.println(birth + "°³¶ì");
			break;
		case 3:
			System.out.println(birth + "µÅÁö¶ì");
			break;
		case 4:
			System.out.println(birth + "Áã¶ì");
			break;
		case 5:
			System.out.println(birth + "¼Ò¶ì");
			break;
		case 6:
			System.out.println(birth + "È£¶ûÀÌ¶ì");
			break;
		case 7:
			System.out.println(birth + "Åä³¢¶ì");
			break;
		case 8:
			System.out.println(birth + "¿ë¶ì");
			break;
		case 9:
			System.out.println(birth + "¹ì¶ì");
			break;
		case 10:
			System.out.println(birth + "¸»¶ì");
			break;
		case 11:
			System.out.println(birth + "¾ç¶ì");
			break;
		case 0:
			System.out.println(birth + "¿ø¼þÀÌ¶ì");
			break;

		}

	}

}
