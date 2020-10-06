package JAVA1006;

public class Main1 {

	public static void main(String[] args) {
		String score = "100, 31, 53, 83";
		String[] str = score.split(",");
		//", " 로 공백 1칸은 줘야함   아니면 trim쓰던지
		int sum =0;
		double avg=0.0;
		for (int i = 0; i < str.length; i++) {
			String s = str[i].trim();
			sum += Integer.parseInt(s);
		}
		System.out.println("합 :"+sum);
		System.out.println("평균 :"+(double)sum/str.length);
		
	}

}
