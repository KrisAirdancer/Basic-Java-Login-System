package main;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> loginInfo = new HashMap<String, String>();

	
	IDandPasswords() {
		
		loginInfo.put("Chris", "1234567890");
		loginInfo.put("TheStardustMechanic", "0987654321");
		loginInfo.put("KrisAirdancer", "Password");
	}
	
	protected HashMap getLogininfo() {
		return loginInfo;
	}
}
