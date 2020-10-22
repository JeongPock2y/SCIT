package JAVA1014;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudetnMap {

	public static void main(String[] args) {
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1,new Student("hong",90));
		studentMap.put(2,new Student("kong",100));
		studentMap.put(2,new Student("kong",80));//key값은 동일한 키값이 들어오면 덮어씌움
		studentMap.put(4,new Student("xiang",70));
		
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("hong",90) ;
//		map.put("kong",100) ;
//		map.put("xiang",80) ;
		
		
		
		System.out.println("keyset");
		System.out.println("---키를꺼내서 벨류를꺼낸거----");
		Set<Integer> keys = studentMap.keySet();
		for (Integer integer : keys) {
			System.out.println("Student [name=" + studentMap.get(integer).getName() + ", "
					+ "score=" + studentMap.get(integer).getScore() + "]");
		}
		System.out.println("entry set");
		System.out.println("---키랑 벨류를다꺼낸거----");
		Set<Map.Entry<Integer,Student>> ent =studentMap.entrySet();
		for (Map.Entry<Integer, Student> e : ent) {
			
			System.out.println("키값 :"+e.getKey()+"value :"+e.getValue());
		}
	}

}
