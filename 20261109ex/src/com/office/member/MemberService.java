package com.office.member;

public class MemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

}
