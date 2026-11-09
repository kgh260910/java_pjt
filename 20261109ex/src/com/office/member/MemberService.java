package com.office.member;

public class MemberService {
	
	final private MemberDao memberDao;
	
	final public static int SIGN_UP_FAIL = 0;
	final public static int SIGN_UP_SUCCESS = 1;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public int signUp(MemberDto memberDto) {
		//아이디 중복체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		//회원가입
		if (!isMember) {
			return memberDao.insertMember(memberDto);
		} else {
			return SIGN_UP_FAIL;
		}
	}

	// 로그인
	public MemberDto signIn(MemberDto memberDto) {
		
		MemberDto seletedMemberDto = 
				memberDao.selectedMemberByMemId(memberDto.getMemId());
		
		if (seletedMemberDto != null 
				&& 
				seletedMemberDto.getMemPw().equals(seletedMemberDto.getMemPw())) {
			return seletedMemberDto;	
		    } 
		
//			if (seletedMemberDto.getMemPw().equals(seletedMemberDto.getMemPw())) {
//				return seletedMemberDto;
				
		 else {
			return null;
		
		 } 
		
	}

}
