import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffere {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] score=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			
			String score_=br.readLine();
			
			score[i]=Integer.parseInt(score_);
			if(score[i]%5!=0) {
				break;
			}
			if(score[i]<40) {
				score[i]=40;
			}
			sum+=score[i];
		}
		bw.write(String.valueOf(sum/score.length));
		bw.flush();
		bw.close();
		br.close();
	}

}
