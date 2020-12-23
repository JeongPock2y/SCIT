package tourarea.manager;

import java.util.ArrayList;

import tourarea.vo.TourArea;
import tourarea.vo.jp.TourArea_jp;


public interface AbstractTourManager {
	
	
	public TourArea searchId(String name);
	
	public TourArea_jp searchId_jp(String name);

	/**
	 * ���޹��� Player��ü�� ����Ʈ�� �߰������Ѵ�.
	 * @param player ����Ʈ�� �߰��� Player��ü
	 * @return �ߺ����� ���� ��ȣ�� ���� ������ ����Ʈ�� �߰��Ǹ� true, �׷��� ������ false
	 */
	public boolean insertTour(TourArea tourarea);
	
	public boolean insertTour_jp(TourArea_jp tourarea);
	
	/**
	* ����� �̸��޾� �׸� ����
	 */
	public boolean deleteTour(String name);
	public boolean deleteTour_jp(String name);
	
	/**
	 *  ����� �̸��� �Է¹޾� �󼼳��� ����
	 */
	public boolean updateTour(TourArea tourarea);
	
	public boolean updateTour_jp(TourArea_jp tourarea);
	

	/**����ö �뼱 1-3ȣ������*/
	public ArrayList<TourArea> tourAreaListSubway(int subwayline);

	public ArrayList<TourArea_jp> tourAreaListSubway_jp(int subwayline);

	
	
	/**
	 * ���޵� Ÿ���� ��������� ����  (1:��ü 2:���� 3:���� )
	 */
	public ArrayList<TourArea> tourAreaListForType(int type);
	public ArrayList<TourArea_jp> tourAreaListForType_jp(int type);







	
	
}
