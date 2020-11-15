package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis의 환경 설정 읽고 객체 생성
 * 이파일을 통해서 xml을 통해 sql 불러온걸 쓸수있게된다
 */
public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	//static block : 클래스 로딩될때 딱한번만 실행되고 가장먼저 실행된다.
	static {
		//우리가 지금까지 한 설정들이  "mybatis-config.xml" 안의 파일에 있다
		String resource = "mybatis-config.xml";		//Mybatis 환경설정 파일 읽기. src 경로에 저장.
		//위의 설정을 읽어서 SqlSessionFactory 객체를 생성하라 그리고 reader.close();닫아라 객체생성은 1번만
		//객체를 하나만 생성하는것을 보고 싱글톤 패턴
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
