package user.mgr;

import java.util.ArrayList;

import user.dao.UserDAO;
import user.vo.User;

public class UserManager {
	private UserDAO dao = new UserDAO();			//DB관련 처리를 하는 클래스의 객체
		
	//회원정보 저장
		public boolean insertUser(User user) {
			int cnt = dao.insertUser(user);
			
			if(cnt > 0) {
				return true;
			}
			return false;
		}

		//전체 회원 목록
		public ArrayList<User> listUser() {
			ArrayList<User> list = dao.listUser();
			return list;
		}
}
