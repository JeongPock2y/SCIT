package tourarea.manager;

import java.util.ArrayList;

import tourarea.vo.TourArea;
import tourarea.vo.jp.TourArea_jp;


public interface AbstractTourManager {
	
	
	public TourArea searchId(String name);
	
	public TourArea_jp searchId_jp(String name);

	/**
	 * 전달받은 Player객체를 리스트에 추가저장한다.
	 * @param player 리스트에 추가할 Player객체
	 * @return 중복되지 않은 번호를 가진 정보가 리스트에 추가되면 true, 그렇지 않으면 false
	 */
	public boolean insertTour(TourArea tourarea);
	
	public boolean insertTour_jp(TourArea_jp tourarea);
	
	/**
	* 장소의 이름받아 항목 삭제
	 */
	public boolean deleteTour(String name);
	public boolean deleteTour_jp(String name);
	
	/**
	 *  장소의 이름을 입력받아 상세내용 수정
	 */
	public boolean updateTour(TourArea tourarea);
	
	public boolean updateTour_jp(TourArea_jp tourarea);
	

	/**지하철 노선 1-3호선으로*/
	public ArrayList<TourArea> tourAreaListSubway(int subwayline);

	public ArrayList<TourArea_jp> tourAreaListSubway_jp(int subwayline);

	
	
	/**
	 * 전달된 타입의 선수목록을 리턴  (1:전체 2:궁전 3:공원 )
	 */
	public ArrayList<TourArea> tourAreaListForType(int type);
	public ArrayList<TourArea_jp> tourAreaListForType_jp(int type);







	
	
}
