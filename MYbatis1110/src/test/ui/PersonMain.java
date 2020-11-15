package test.ui;

import test.dao.PersonDAO;
import test.vo.PersonVO;

public class PersonMain {

	public static void main(String[] args) {
//		PersonVO p = new PersonVO();
//		p.setName("정연욱");
//		p.setAge(28);
//		//num은 시퀀슸ㄹ거라서 안만듬
//		//위에서  데이터 입력
//		//아래서 저장할수있는 메소드 실행
//		PersonDAO dao = new PersonDAO();
//		dao.insertPerson(p);
		new PersonUI();
	}

}
