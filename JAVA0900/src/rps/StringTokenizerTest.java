package rps;
import java.util.*;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("the grass is greener on the other side of thr fence");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			
			System.out.println("모두 11개의 단어가 있습니다.");
			
		
		}

	}

}
