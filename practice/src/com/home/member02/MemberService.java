package com.home.member02;

public class MemberService implements IMemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void signUp(MemberDto memberDto) {
	
		// 아이디 중복 체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입
		if (!isMember) {
			int result = memberDao.insertNewMember(memberDto); // 0:실패, 1:성공
			if (result == 0) {
				System.out.println("회원가입 실패입니다.");
			} else {
				System.out.println("회원가입 성공입니다.");
			}
		} else {
			System.out.println("이미 존재하는 ID입니다.");
		}
		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto = 
				memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패!!");
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updatedMemberDto = memberDao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("수정 완료");
		} else {
			System.out.println("수정 실패");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}

	public boolean doAuthenticationByMemIdandMemPw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		return dto != null ? true : false;
	}

}
