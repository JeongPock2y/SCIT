package JAVA1006;

public class ReplaceTrim {

	public static void main(String[] args) {
		String str = "Lee sun sin";
		if(str.contains("sun"))
			System.out.println("성 :"+ str.substring(0,3));
			System.out.println("이름 :"+str.replace(
					"sun", "soon").substring(4));
	}
//		if (str.contains("sun")) {
//			str = str.replace("sun", "soon");
//		}
//		String fname = str.substring(0, 3);
//		String Lname = str.substring(4);
//		System.out.println(fname);
//		System.out.println(Lname);
//		
//	}
}
