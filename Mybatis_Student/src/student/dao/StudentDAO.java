package student.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.Student;


public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	

	public int insert(Student s) {
		int count =0;
		SqlSession ss =null;
		try {
			ss = factory.openSession();
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			count=mapper.insert(s);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return count;
	}


	/*
	 * public ArrayList<Student> selectAll() {
	 * 
	 * }
	 * 
	 * 
	 * public int delete(String id) {
	 * 
	 * }
	 * 
	 * 
	 * public int update(Student s) {
	 * 
	 * }
	 * 
	 * public ArrayList<Student> selectName(String name) {
	 * 
	 * }
	 */

}
