package com.office.member04;

public class MemberService {
	
	MemberDao memberDao = new MemberDao();

	public void signUp(MemberDto memberDto) {
		
		//아이디 중복체크
		
		//회원가입
		memberDao.insertNewMember(memberDto);
		
		
	}

}
