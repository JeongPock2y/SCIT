package global.sesoc.manager;

import java.util.ArrayList;
import global.sesoc.vo.Toy;

public interface ToyManager {

	/**
	 * ��ǰ�� �Ϸ� ��ȣ�� �̿��� �ش��ϴ� ��ǰ�� �ִ��� ã�´�.
	 * @param serialNum ��ǰ��ȣ
	 * @return ��ǰ��ȣ�� ���� �˻��� ��ǰ ����, �˻��� ������ ���� ��� null�� ���ϵȴ�.
	 */
	public Toy searchToy(String serialNum);

	/**
	 * ���޹��� Toy ��ü�� List�� �߰�
	 * @param list�� �߰��� Toy��ü
	 * @return boolean �߰�����(�߰� ���� �� true, �߰� ���н� false) 
	 */
	public boolean insertToy(Toy toy);
	
	/**
	 * ��ǰ ��ȣ�� �̿��� �ش� ��ǰ�� ã���� ��� ��ǰ�� ��Ͽ��� �����ϰ�  true�� �����Ѵ�.
	 * ��ǰ��ȣ�� ã�� ������ ��� false�� �����Ѵ�.
	 * @param serialNum ������ ��ǰ ��ȣ
	 * @return boolean ���� ���� ���� (���� �Ϸ� �� true, ���� ���� �� false)
	 */
	public boolean deleteToy(String serialNum);
	
	
	/**
	 * ��ǰ ��ȣ�� ������ ���Ե� Toy��ü�� ���޹޾� ����Ʈ���� ã�� ������ �����Ѵ�.
	 * @param toy ������ ������ ���Ե� ��ü
	 * @return ���� �Ϸ� ����
	 */
//	public boolean updateToy(Toy toy);
	
	/**
	 * �ּұݾװ�, �ִ�ݾ��� ���޹޾� �ش��ϴ� ���� ���޹޾� �� ���������� ������ �峭���� �����Ѵ�.
	 * @param �ּҰ�, �ִ밪
	 * @return ������ �ݾ� �ȿ� �����ϴ� �峭���� ���
	 */
	public ArrayList<Toy> toyListForPrice(int minPrice, int maxPrice);
	
	/**
	 * ���޵� Ÿ���� �峭�� ����� ����Ѵ�.
	 * @param �峭�� Ÿ��
	 * @return List<Toy> �˻��� �峭�� ���
	 */
	public ArrayList<Toy> printToyInfo(int type);
}
