package com.home;

import com.home.home.HomeController;
import com.home.member.MemberController;
import com.home.member.MemberDao;
import com.home.member.MemberService;

public class Container {
	
	private static Container container;
	
	final private HomeController homeController;
	
	final private MemberController memberController;
	final private MemberService memberService;
	final private MemberDao memberDao;
	
	private Container() {
		
		homeController = new HomeController();
		
		memberDao = new MemberDao();
		memberService = new MemberService(memberDao);
		memberController = new MemberController(memberService);
		
	}
	
	public static Container getInstance() {
		if (container == null) {
			container = new Container();
		}
		return container;
	}
	

}
