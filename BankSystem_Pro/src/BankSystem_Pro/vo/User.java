package BankSystem_Pro.vo;

public class User {
	private String name;
	private String accountNumber;
	private int charge;
	
	
	public User(String name, String accountNumber, int charge) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.charge = charge;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	@Override
	public String toString() {
		return "회원정보[성명=" + name +"님"+ ", "
				+ "계좌번호=" + accountNumber + ", "
						+ "잔고=" + charge + "원]";
	}
}
