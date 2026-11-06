package com.office.test01;

public class MemberService implements IMemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	// 회원가입
	@Override
	public void signUp(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		if (!isMember) {
			boolean result = memberDao.insertNewMember(memberDto);
			if (result) {
				System.out.println("회원가입에 성공했습니다!!");
			} else {
				System.out.println("회원가입에 실패했습니다!!");
			}
		} else {
			System.out.println("이미 존재하는 ID입니다.");
		}
		
	}

	// 로그인 - 등록되지않은 회원으로 로그인불가
	@Override
	public void signIn(MemberDto memberDto) {
	
		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			DiaryContainer.getInstance();
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패!!");
		}
		
	}

	@Override
	public void signOut(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updatedMemberDto = 
				memberDao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("Modify SUCCESS!!");
		} else {
			System.out.println("Modify FAIL!!");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		MemberDto deletedMemberDto = memberDao.deleteMemberByMemIdAndMemPw(memberDto);
		
		if (deletedMemberDto != null) {
			System.out.println("탈퇴처리 완료되었습니다.");
		} else {
			System.out.println("탈퇴처리 실패했습니다.");
		}
	}

	public boolean doAuthenticationByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		return dto != null ? true : false;
	}

}

/* - 멤버 서비스 상세조건
- 아이디는 중복될 수 없다.
- 비밀번호는 최소 4자리 이상이어야 한다.
- 등록되지 않은 아이디로 로그인할 수 없다.
- 로그인 상태에 따라 메뉴가 다르게 출력되어야 한다.
- 로그인하지 않은 상태에서는 회원정보 수정 및 탈퇴할 수 없다.
- 회원탈퇴 시 해당 회원의 데이터가 삭제되어야 한다.
*/