package main;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();

	
	IDandPasswords() {
		
		logininfo.put("Chris", "1234567890");
		logininfo.put("TheStardustMechanic", "0987654321");
		logininfo.put("KrisAirdancer", "Password");
	}
	
	protected HashMap getLogininfo() {
		return logininfo;
	}
}
