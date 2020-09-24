package CountryCurrency;

public class Currency {
	private double amount;
	private String notation;
	
	public Currency(double amount,String notation) {
		this.amount=amount;
		this.notation=notation;
	}
	//toString() 메소드 오버라이딩 "자바 object toString 메소드"
	public String toString() {
		return String.format("%s: %.2f %s", this.getClass().getSimpleName(),amount,notation);
	}//this.getClass().getSimpleName()  object의 이름을 가져오는기능
}
 