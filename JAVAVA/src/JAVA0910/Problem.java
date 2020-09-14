package JAVA0910;

import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			while(true) {
				char ch =(char)isr.read();
				if(ch == '\r' ) {
					break;
				}
				
				System.out.print(ch);
			
		}
			isr.close();
			

	}catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}

}
}