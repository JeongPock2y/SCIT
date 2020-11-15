package node;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class error1 {
	private static final Logger _logger = Logger.getLogger(error1.class);

	public static void main(String[] args) throws IOException {
//  log4j.properties 파일 불러오고
		FileInputStream log4jRead = new FileInputStream("log4j.properties");
		Properties log4jProperty = new Properties();
		log4jProperty.load(log4jRead);
//  property 타입으로 읽어서 configure와 연동
		PropertyConfigurator.configure(log4jProperty);
		_logger.info("--");
		_logger.info("log4j.properties 로그 설정");
	}
}
