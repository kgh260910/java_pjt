package com.home.member02;

public class MemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

}
