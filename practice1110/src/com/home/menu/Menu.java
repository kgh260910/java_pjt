package com.home.menu;

import java.util.HashMap;

import com.home.session.Session;

public class Menu {
	
	static public void generateMenu() {
		
		HashMap<String, Object> attributies = Session.getInstance().getAttributies();
		Object object = attributies.get("signInedMemberId");
		
		if (object == null) {
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
		} else {
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-READ 99.SYSTEM-OUT");
		}
	}

}
