package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis�� ȯ�� ���� �а� ��ü ����
 * �������� ���ؼ� xml�� ���� sql �ҷ��°� �����ְԵȴ�
 */
public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	//static block : Ŭ���� �ε��ɶ� ���ѹ��� ����ǰ� ������� ����ȴ�.
	static {
		//�츮�� ���ݱ��� �� ��������  "mybatis-config.xml" ���� ���Ͽ� �ִ�
		String resource = "mybatis-config.xml";		//Mybatis ȯ�漳�� ���� �б�. src ��ο� ����.
		//���� ������ �о SqlSessionFactory ��ü�� �����϶� �׸��� reader.close();�ݾƶ� ��ü������ 1����
		//��ü�� �ϳ��� �����ϴ°��� ���� �̱��� ����
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
