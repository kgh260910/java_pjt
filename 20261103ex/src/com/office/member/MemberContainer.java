package com.office.member;

// 싱글턴 클래스 getter만 만들면 된다.
public class MemberContainer {
	
	// final(상수화 해줌)을 넣음으로써 해당클래스에서 new MemberController();로 새 객체를 생성하지 못합니다. 
	final private MemberController memberController = new MemberController();
	private MemberService memberService = new MemberService();
	private MemberDao memberDao = new MemberDao();
	
	private static MemberContainer memberContainer = new MemberContainer();
	
	private MemberContainer() {
		
	}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
	}

	public MemberController getMemberController() {
		return memberController;
	}
	
	
	

}
