package user.mgr;

import java.util.ArrayList;

import user.dao.UserDAO;
import user.vo.User;

public class UserManager {
	private UserDAO dao = new UserDAO();			
		
	//회원정보 저장
	public boolean insertUser(User user) {
		int count =dao.insertUser(user);
		boolean check =false;
		if (count > 0) {
			check =true;
		}
		return check;
		
	}

	//전체 회원 목록
	public ArrayList<User> listUser() {
		return dao.listUser();
		
		
	}
}
