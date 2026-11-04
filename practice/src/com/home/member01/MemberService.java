package com.home.member01;

public class MemberService {
	
	MemberDao memberDao = new MemberDao();

	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입
		if (!isMember) {
			int result = memberDao.insertNewMember(memberDto); // 0:실패,1:성공
			if (result == 1) 
				System.out.println("회원가입에 성공했습니다.");
			else 
				System.out.println("회원가입에 실패했습니다.");
		}
		
		
	}

}
