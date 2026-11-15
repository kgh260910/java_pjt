package com.home.member;

public class MemberService {
	
	final public static int SIGN_UP_SUCCESS = 1;
	final public static int SIGN_UP_FAIL = 0;
	final private MemberDao memberDao;

	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public int signUp(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			return memberDao.insertMember(memberDto);
		} else {
			return SIGN_UP_FAIL;
		}
		
	}

}
