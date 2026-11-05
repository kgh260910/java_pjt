package com.home.member02;

public class MemberContainer {
	
	final public MemberDao memberDao = new MemberDao();
	final public MemberService memberService = new MemberService(memberDao);
	final public MemberController memberController = new MemberController(memberService);
	
	private static MemberContainer memberContainer = new MemberContainer();
	
	public MemberContainer() {
	}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		return memberContainer;
	}
	
	
}
