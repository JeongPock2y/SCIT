package addressbook.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import addressbook.vo.AddressVO;

/**
 * 주소 정보 처리 클래스.
 * 등록, 검색, 파일 입출력 등의 기능을 수행
 */
public class AddressManager {
	//등록된 회원 정보를 가지고 있는 list객체
	ArrayList<AddressVO> list ;
	//정보를 list에 넣을거다.
	/**
	 * 기본 생성자  빈 리스트를 생성
	 */
	public AddressManager() {
		list = new ArrayList<AddressVO>();
	}
	/**
	 * 전달된 새 주소를 리스트에 등록한다.
	 * @param vo 등록할 정보를 담은 객체
	 */
	public void addAddress(AddressVO vo) {
		list.add(vo);
	}	
	
	/**
	 * 전체 주소 정보 리스트를 리턴한다.
	 * @return 주소정보 객체들이 저장된 리스트
	 */
	public ArrayList<AddressVO> getList() {
			
		return list;
	}
	/**
	 * 이름으로 주소 정보 검색
	 * @param name 검색할 이름
	 * @return	검색된 객체 또는 없으면 null
	 */
	public AddressVO getAddress(String name) {
		for (int i = 0;i < list.size(); i++) {
			//저장된 리스트의 객체 정보중 이름을 꺼내서 
			//입력된 이름과 같은지를 비교하는 구문
			if(list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}
	public void updateAddress(AddressVO vo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(vo.getName())) {
				list.set(i, vo);	
			}
		}
	}
	
	/**
	 * 그룹으로 주소 정보 검색
	 * @param group 검색할 그룹
	 * @return 검색된 객체들을 담은 리스트
	 */
	public ArrayList<AddressVO> getGroupList(String group) {
		ArrayList<AddressVO> searchList = new ArrayList<>();
		for (AddressVO addressVO : searchList) {
			if (addressVO.getGroup().equals(group)) {
				searchList.add(addressVO);
			}
		}
		return searchList;
	}
	/**
	 * 이름으로 주소 정보 삭제
	 * @param name 삭제할 이름
	 * @return 삭제 성공 여부
	 */
	public boolean removeAddress(String name) {
		boolean checkremove = false;
		for (AddressVO addressVO : list) {
			if(addressVO.getName().equals(name)) {
				list.remove(addressVO);
				checkremove = true;
			}
		}
		return checkremove;
	}
}
