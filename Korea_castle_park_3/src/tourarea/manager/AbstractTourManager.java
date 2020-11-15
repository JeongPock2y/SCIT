package tourarea.manager;

import java.util.ArrayList;

import tourarea.vo.TourArea;


public interface AbstractTourManager {
	
	
	public TourArea searchId(String name);

	/**
	 * ���޹��� Player��ü�� ����Ʈ�� �߰������Ѵ�.
	 * @param player ����Ʈ�� �߰��� Player��ü
	 * @return �ߺ����� ���� ��ȣ�� ���� ������ ����Ʈ�� �߰��Ǹ� true, �׷��� ������ false
	 */
	public boolean insertTour(TourArea tourarea);
	
	/**
	* ����� �̸��޾� �׸� ����
	 */
	public boolean deleteTour(String name);
	
	/**
	 *  ����� �̸��� �Է¹޾� �󼼳��� ����
	 */
	public boolean updateTour(TourArea tourarea);
	

	/**����ö �뼱 1-3ȣ������*/
	public ArrayList<TourArea> tourAreaListSubway(int subwayline);
	
	
	/**
	 * ���޵� Ÿ���� ��������� ����  (1:��ü 2:���� 3:���� )
	 */
	public ArrayList<TourArea> tourAreaListForType(int type);

	
	
}