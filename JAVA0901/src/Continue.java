
public class Continue {

	public static void main(String[] args) {
	int num = 0;
	while(num <100) {
		num++;
		if(num%2==0) {
			continue;
		}
		System.out.println(num);
		}
	}

}
