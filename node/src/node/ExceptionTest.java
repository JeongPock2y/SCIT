package node;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest {

	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		
		LOG.setLevel(Level.INFO);
		LOG.severe("severe Log");
		LOG.warning("warning Log");
		LOG.info("info Log");
		/*
		 * public static void main(String[] args) { try { // 예외 발생 가능성 코드
		 * makeException(); } catch (ArithmeticException e){ // 예외 발생 처리 코드1
		 * System.out.println(e.toString()); } catch (Exception e) { // 예외 발생 처리 코드2
		 * System.out.println(e.toString()); } finally { // 예외 발생과 상관없이 언제나 실행되는 코드
		 * System.out.println("언제나 실행"); } }
		 */

		/*
		 * public static void makeException() throws Exception { throw new Exception();
		 * }
		 */
	}
}
