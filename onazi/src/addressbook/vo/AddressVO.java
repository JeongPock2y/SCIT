package addressbook.vo;
/**
 * 개인의 이름, 전화번호 등의 정보를 가지는 VO 클래스
 * 생성자, Getters, Setters, toString() 등의 메소드를 정의해서 사용
 */
public class AddressVO {
	private String name;				//이름
	private String group;				//분류 그룹
	private String phone;				//전화번호
	private String address;				//주소
	private String email;				//E-mail 주소
	
	public AddressVO() {
		
	}

	public AddressVO(String name, String group, String phone, String address, String email) {
		super();
		this.name = name;
		this.group = group;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressVO [name=" + name + ", group=" + group + ", phone=" + phone + ", address=" + address + ", email="
				+ email + "]";
	}
	
}
