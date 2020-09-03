import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
int start, end, temp;
int sum = 0;

System.out.print("첫 번째 정수 입력 : ");
start = input.nextInt(); 
System.out.print("두 번째 정수 입력 : ");
end = input.nextInt();

if (start > end) {    
	temp = start;
	start = end;
	end = temp;   
}      

for (int i = start; i <= end; i++) {
	sum += i;   
}      
System.out.println(start + " ~ " + end + "까지의 합계 : " + sum);  
