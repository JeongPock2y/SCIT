package BankSystem_Pro.vo;

import java.util.ArrayList;
import java.util.List;

public class SinhanBank {

	private List<User> users = new ArrayList<>();
	
	public void register(User user) {
		users.add(user);
	}
	public void input(String accountNumber, int charge) {
		for (User u : users) {
			if (accountNumber.equals(u.getAccountNumber())) {
				u.setCharge(u.getCharge() + charge);
				return;
			}
		}
	}
	public void output(String accountNumber, int charge) {
		for (User u : users) {
			if (accountNumber.equals(u.getAccountNumber())) {
				int userCharge = u.getCharge();
				if (userCharge - charge < 0) return;
				u.setCharge(userCharge - charge);
				return;
			}
		}
		
	}
	
	public void send(String sendAccountNumber,String receiveAccountNumber, int charge) {
		
		User sendUser = null;
		User receiveUser = null;
		
		for (User user : users) {
			if (user.getAccountNumber().equals(sendAccountNumber)) {
				sendUser = user;
				continue;
			}
			if (user.getAccountNumber().equals(receiveAccountNumber)) {
				receiveUser = user;
				continue;
			}
		}
		if (sendUser != null && receiveUser != null) {
			int sendUserCharge = sendUser.getCharge();
			if (sendUserCharge - charge < 0) return;
			sendUser.setCharge(sendUserCharge - charge);
			receiveUser.setCharge(receiveUser.getCharge() + charge);
		}	
	}
	public void printAllUsers() {
		/*
		 * users.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User user) { System.out.println(user); } });
		 */
		users.forEach(user -> {
			System.out.println(user);
		});
		/*
		 * for (User user : users) { System.out.println(user); }
		 */
		
	}
}

