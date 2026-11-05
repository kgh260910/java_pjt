package com.office.member;

// 싱글톤 클래스 getter만 만들면 된다.
public class MemberContainer {
	
	// final(상수화 해줌)을 넣음으로써 해당클래스에서 new MemberController();등으로 재할당하지 못합니다. 
	final private MemberController MEMBERCONTROLLER = new MemberController();
	final private MemberService MEMBERSERVICE = new MemberService();
	final private MemberDao MEMBERDAO = new MemberDao();
	
	private static MemberContainer memberContainer = new MemberContainer();
	
	
	// 생성자를 만들어 놓지 않으면(private) 자바에서 public으로 기초생성자를 생성해서 싱글톤이 의미없게된다.
	private MemberContainer() {
		
	}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
	}

	public MemberController getMemberController() {
		return MEMBERCONTROLLER;
	}

	public MemberService getMemberService() {
		return MEMBERSERVICE;
	}

	public MemberDao getMemberDao() {
		return MEMBERDAO;
	}
	
	
	
	

}
