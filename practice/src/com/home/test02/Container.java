package com.home.test02;

import com.home.diary01.DiaryController;

public class Container {
	
	private static Container container;
	
	final private HomeController homeController;
	
	final private MemberController memberController;
	final private MemberService memberService;
	final private MemberDao memberDao;
	
	private Container() {
		
		this.homeController = new HomeController();
		
		this.memberDao = new MemberDao(DiaryDb.getInstance());
		this.memberService = new MemberService(this.memberDao);
		this.memberController = new MemberController(this.memberService);
		
	}
	
	public static Container getInstance() {
		if (container == null)
			container = new Container();
		return container;
	}

	public HomeController getHomeController() {
		return homeController;
	}

	public MemberController getMemberController() {
		return memberController;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	

}
