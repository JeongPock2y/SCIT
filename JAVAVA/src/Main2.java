import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ã¹¹øÂ°¼ö :");
		int n1 = sc.nextInt();
		System.out.println("µÎ¹øÂ°¼ö :");
		int n2 = sc.nextInt();
		System.out.println("-------------");
		System.out.println("1.µ¡¼À");
		System.out.println("2.»¬¼À");
		System.out.println("3.°ö¼À");
		System.out.println("4.³ª´°¼À");
		System.out.println("--------------");
		System.out.println("¸Å´º ¼±ÅÃ :");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			System.out.println("µ¡¼À"+n1+n2);
			break;
		case 2 : 
			System.out.println("»¬¼À"+(n1-n2));
			break;
		case 3 :
			System.out.println("°ö¼À"+(n1*n2));
			break;
		case 4 : 
			System.out.println("³ª´©»ù"+(n1/n2));
			break;
		
		}
		
}
}