
public class TrimReplace {

	public static void main(String[] args) {
		String str = "\t\t2020.4.4";
		System.out.println("정답1");
		System.out.printf("날짜 : %s\n", str.trim().replace(".", "-"));
		//2020-4-4
		//trim()이  \t\t 공백을 없에줌 깍아줌
		//replace "."  -> "-"
		//%s 는 문자열  %d int
		System.out.println("정답 2");
		String str1 = str.trim();
		String str2 = str1.replace(".", "-");
		System.out.printf("날짜 : %s\n", str2);
		System.out.println("정답 3");
		System.out.printf("날짜 : %s-%02d-%02d\n", "2020",4,4);
		
		System.out.println("정답 4");
		 int year=987;
		 int month=4;
		 int day=4;
		System.out.printf("날짜 : %04d-%02d-%02d\n", year,month,day);
		//%04d-%02d-%02d\n이거가  일단  0000-00-00의 포맷은 만들어준거임  
		//그래서  year가  3자리라도 관꼐없이 4자리로 출력을 가능하게해줌
		
		System.out.println("정답 5");
		//split 사용 방법 (쪼개다)등분하기      .은   .앞에  //붙여줘야함 그냥외우기!!
		String[] strs=str.trim().split("\\.");
		//strs 는 그냥 문장들이라는 의미로 s해서쓴거  
		//트림 날리고  3등분해서   넣어주고  이걸  인트형으로 parseing 해줘서 변환 후 출력
		//3등분한게 strs으로 들어감
		year=Integer.parseInt(strs[0]);
		month=Integer.parseInt(strs[1]);
		day=Integer.parseInt(strs[2]);
		System.out.printf("날짜 : %04d-%02d-%02d\n", year,month,day);
	}

}
