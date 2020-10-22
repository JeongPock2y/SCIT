package JAVA1012;

public class PairMain {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("철수", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("안녕", "시발아");
		System.out.println(p1.getKey()+""+p1.getValue());
		System.out.println(p2.getKey()+""+p2.getValue());
		System.out.println(p1.getKey()+""+p2.getValue());
		System.out.println(p2.getKey()+""+p1.getValue());
	}

}
