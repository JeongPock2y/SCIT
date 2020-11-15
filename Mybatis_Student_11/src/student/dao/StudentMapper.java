package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface StudentMapper {
	//Student ��ü ����
	public int insert(Student s);
	//��ü �б�
	public ArrayList<Student> selectAll() ;
	//����
	public int delete(String id) ;
	//����
   public int update(Student s) ;
	//�̸����� �˻�
  public ArrayList<Student> selectName(String name) ;

}
