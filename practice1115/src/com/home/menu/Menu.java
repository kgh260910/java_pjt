package com.home.menu;

import java.util.HashMap;

import com.home.Config;
import com.home.session.Session;

public class Menu {
	
	final public static int MEMBER_SIGN_UP = 1;
	final public static int MEMBER_SIGN_IN = 2;
	final public static int MEMBER_SIGN_OUT = 3;
	final public static int MEMBER_MODIFY = 4;
	final public static int MEMBER_DELETE = 5;
	
	final public static int DIARY_WRITE = 6;
	final public static int DIARY_READ = 7;
	
	final public static int SYSTEM_OUT = 99;
	
	static public void generateMenu() {
		
		if (Session.getInstance().getAttributies(Config.SIGNED_MEMBER_ID) == null) {
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
		} else {
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-READ 99.SYSTEM-OUT");
		}
		/*
		 * Session의 해쉬맵getter를 수정해서 정상적으로 실행이 되지 않는다.
		HashMap<String, Object> attributies = Session.getInstance().getAttributies();
		Object object = attributies.get(Config.SIGNED_MEMBER_ID);
		
		if (object == null) {
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
		} else {
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-READ 99.SYSTEM-OUT");
		}
		*/
		
	}

}
