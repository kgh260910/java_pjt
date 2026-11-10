package com.office.menu;

import java.util.HashMap;

import com.office.config.Config;
import com.office.session.Session;

public class Menu {
	
	final public static int MEMBER_SIGN_UP = 1;
	final public static int MEMBER_SIGN_IN = 2;
	final public static int MEMBER_SIGN_OUT = 3;
	final public static int MEMBER_MODIFY = 4;
	final public static int MEMBER_DELETE = 5;
	
	final public static int DIARY_WRITE = 6;
	final public static int DIARY_READ = 7;
	
	final public static int SYSTEM_OUT = 99;
	
	
	
	// 객체생성하려니 코드가 많아 static으로 간단히 호출하도록 설정
	static public void generateMenu() {
		
		// 세션으로부터 			
		if (Session.getInstance().getAttribute(Config.SIGNED_MEMBER_ID) == null) {
			// 로그인 하기 전 
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
		} else {
			// 로그인 후
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-READ 99.SYSTEM-OUT");
						
		}
		
	}

}
