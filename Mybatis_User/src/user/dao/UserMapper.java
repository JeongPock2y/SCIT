package user.dao;

import java.util.ArrayList;
import java.util.HashMap;

import user.vo.User;

/**
 * Mapper XML�� SQL�� ��� �޼���
 */
public interface UserMapper {
	//ȸ�� ���� ����
	public int insertUser(User user);
	//ȸ�� ���� �� �߰� ���� ����
	public int insertAddress(User user);
	//ȸ�� ��� 	
	public ArrayList<User> listUser();
}
