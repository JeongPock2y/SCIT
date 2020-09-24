package JAVA0924;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileMain {

	public static void main(String[] args)throws IOException {
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
		bw.write("안녕하세요");
		bw.newLine();
		bw.write("오늘은 예외처리를 배워보려다가  이렇게 찾아왔습니다.");
		bw.newLine();
		bw.write("chang won's 彼女会いたい！❣");
		bw.newLine();
		bw.write("(저도) 잘부탁드립니다.");
		
		
		if(null != bw) {
			System.out.println("sample이 생성되었습니다.");
			bw.close();
		}
		}catch(IOException e){
			System.out.println(e);
		}finally {
			SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 SSS밀리초");
			System.out.println("이편지는"+simple.format(new Date())+"에 작성되었습니다");		
			System.out.println("헷!");
		}

	}

}

