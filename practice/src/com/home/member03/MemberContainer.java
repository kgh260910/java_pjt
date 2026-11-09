package com.home.member03;

public class MemberContainer {
	
	final public MemberDao memberDao = new MemberDao();
	final public MemberService memberService = new MemberService();
	final public MemberController memberController = new MemberController();
	
	private static MemberContainer memberContainer = new MemberContainer();
	
	private MemberContainer() {
		
	}
	
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		return memberContainer;
		
	}


	public MemberDao getMemberDao() {
		return memberDao;
	}


	public MemberService getMemberService() {
		return memberService;
	}


	public MemberController getMemberController() {
		return memberController;
	}
	
	
	

}
