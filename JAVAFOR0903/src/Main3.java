import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("약수 :");
		//int factor =1;  if문으로짯는데  while 답도있어서 그거 도 포함 //가 와일문
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
		if((n%i)==0) {
			System.out.println(i);
			}
		}
// 			while(factor<=num){
		// 	if(num%factor==0){
		// 		System.out.println(factor);
		// 	}
		// 	factor++;
	}

}
