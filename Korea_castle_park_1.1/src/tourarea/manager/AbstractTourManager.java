package tourarea.manager;

import java.util.ArrayList;

import tourarea.vo.TourArea;


public interface AbstractTourManager {
	
	
	public TourArea searchId(String name);

	/**
	 * 전달받은 Player객체를 리스트에 추가저장한다.
	 * @param player 리스트에 추가할 Player객체
	 * @return 중복되지 않은 번호를 가진 정보가 리스트에 추가되면 true, 그렇지 않으면 false
	 */
	public boolean insertTour(TourArea tourarea);
	
	/**
	* 장소의 이름받아 항목 삭제
	 */
	public boolean deleteTour(String name);
	
	/**
	 *  장소의 이름을 입력받아 상세내용 수정
	 */
	public boolean updateTour(TourArea tourarea);
	
	/**입장료의 최솟값 최댓값 검색으로 결과 리턴 기능*/
	public ArrayList<TourArea> tourAreaListForFee(int minFee, int maxFee);
	
	/**지하철 노선 1-3호선으로*/
	public ArrayList<TourArea> tourAreaListSubway();
	
	
	/*주차유무*/
	public ArrayList<TourArea> tourAreaListParking();
	
	/**
	 * 전달된 타입의 선수목록을 리턴  (1:전체 2:궁전 3:공원 )
	 */
	public ArrayList<TourArea> tourAreaListForType(int type);
	
}
