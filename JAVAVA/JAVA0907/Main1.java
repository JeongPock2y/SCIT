package JAVA0907;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;

	public class Main1 {
	   public static void main(String args[]) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      double num1 = Double.parseDouble(st.nextToken());
	      double num2 = Double.parseDouble(st.nextToken());
	      System.out.println(num1 / num2);
	      br.close();
	   }
	}