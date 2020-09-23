package JAVA0916;

import java.util.HashMap;

public class HashTest {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		String hi = "Offline"; 
		String bye = "Online"; 
		hashmap.put(hi,"내일은일본어시험");
		hashmap.put(bye,"창원이형은 여자친구가생겨...ㅅ");
		
		System.out.println(hashmap.get(hi));
		System.out.println(hashmap.containsKey(hi));
		System.out.println(hashmap.get(bye));
		hashmap.remove(bye);
		System.out.println(bye);
	}
	
	
	

}
