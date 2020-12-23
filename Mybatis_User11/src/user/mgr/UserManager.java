package user.mgr;

import java.util.ArrayList;

import user.dao.UserDAO;
import user.vo.User;

public class UserManager {
	private UserDAO dao = new UserDAO();			
		
	//ȸ������ ����
	public boolean insertUser(User user) {
		int count =dao.insertUser(user);
		boolean check =false;
		if (count > 0) {
			check =true;
		}
		return check;
		
	}

	//��ü ȸ�� ���
	public ArrayList<User> listUser() {
		return dao.listUser();
		
		
	}
}
