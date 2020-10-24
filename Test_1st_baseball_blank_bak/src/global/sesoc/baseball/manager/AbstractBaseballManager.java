package global.sesoc.baseball.manager;

import java.util.ArrayList;

import global.sesoc.baseball.vo.Player;

/**
 * BaseballManager���� ������ �������̽� ����
 */
public interface AbstractBaseballManager {
	
	/**
	 * ���޹��� ��ȣ�� ����Ʈ���� �˻��Ѵ�. 
	 * @param id �˻��� ���� ��ȣ
	 * @return ������ ���� ����, ������ null
	 */
	public Player searchId(String id);
	/**
	 * ���޹��� Player��ü�� ����Ʈ�� �߰������Ѵ�.
	 * @param player ����Ʈ�� �߰��� Player��ü
	 * @return �ߺ����� ���� ��ȣ�� ���� ������ ����Ʈ�� �߰��Ǹ� true, �׷��� ������ false
	 */
	public boolean insertPlayer(Player player);
	
	/**
	 * ���� ��ȣ�� �̿��� �ش� ���� ������ ����Ʈ���� �����ϰ� true�� �����Ѵ�.
	 * ���� ���� ��ȣ�� ��쿡�� false�� �����Ѵ�.
	 * @param id ������ ���� ��ȣ
	 * @return boolean ���� ���� ���� (���� �Ϸ� �� true, ���� ���� �� false)
	 */
	public boolean deletePlayer(String id);
	
	/**
	 * ���� ��ȣ�� ������ ���޹޾� �ش� ������ ������ �����Ѵ�.
	 * @param player ������ �����ݾװ� ������ȣ�� ���Ե� ��ü
	 * @return ���� ����
	 */
	public boolean updatePlayer(Player player);
	
	/**
	 * �ּұݾװ�, �ִ�ݾ��� ���޹޾� �� ����������  ������ �޴� ���� ����� �����Ѵ�.
	 * @param minSalary �ּҰ�
	 * @param maxSalary �ִ밪
	 * @return ������ �ݾ� ������ ������ �޴� �������� ���
	 */
	public ArrayList<Player> playerListForSalary(int minSalary, int maxSalary);
	
	/**
	 * WAR�������� ���� ���� ��������� ����Ѵ�. ���� ���� ���� ���� ��쿡�� ���.
	 * @return ���� ���
	 */
	public ArrayList<Player> bestPlayers();
	
	/**
	 * ���޵� Ÿ���� ��������� �����Ѵ�.
	 * @param ���� Ÿ�� (1:��ü 2:���� 3:Ÿ��)
	 * @return �˻��� ���� ���
	 */
	public ArrayList<Player> playerListForType(int type);
	
}
