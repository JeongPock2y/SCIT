import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int n=1;//count
		int a=0;//input
		int sum=0;//�հ�����
		Scanner sc = new Scanner(System.in);
		do {
			
		System.out.print(n+"��° ���� �Է�(-1����) :");
			a = sc.nextInt();
			sum +=a;
			n++;
		}while(a!=-1);
			sum= sum+1;
				System.out.println("����"+sum);
			}
//	boolean key=true;
//	int k=0;
//	
//	while(key) {
//		System.out.println("���ڸ� �Է�(-1�� ����): ");
//		int a = sc.nextInt();
//		
//		k = a != -1 ? k+a : k;
//		
//		if(a==-1) {
//			key=false;
//			System.out.println("����: "+k);
//			System.out.println("����");
//		}
//	}
			
	
			}
	


