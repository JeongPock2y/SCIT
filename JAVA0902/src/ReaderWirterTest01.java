import java.io.*;
public class ReaderWirterTest01 {

	public static void main(String[] args) {
		String filename;
		InputStreamReader re = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(re);
		try {
			System.out.println("파일이름입력");
			
			filename = br.readLine();
			System.out.println(filename);
			re.close();
			br.close();
			
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
