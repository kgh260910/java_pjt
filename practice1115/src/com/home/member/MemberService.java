package com.home.member;

import com.home.Config;
import com.home.session.Session;

public class MemberService {
	
	final public static int SIGN_UP_SUCCESS = 1;
	final public static int SIGN_UP_FAIL = 0;
	final public static int MODIFY_SUCCESS = 1;
	final public static int MODIFY_FAIL = 0;
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

	// 로그인
	public MemberDto signIn(MemberDto memberDto) {
		
		MemberDto selectedMemberDto =
				memberDao.selectedMemberByMemId(memberDto.getMemId());
		
		// 아이디확인 && 비밀번호 확인
		if (selectedMemberDto != null
				&& 
				selectedMemberDto.getMemPw().equals(selectedMemberDto.getMemPw())) {
			return selectedMemberDto;
		}
		
		else {
			return null;
		}
		
	}

	public MemberDto getMember() {
		
		return memberDao.selectedMemberByMemId(
				String.valueOf(Session.getInstance().getAttributies(Config.SIGNED_MEMBER_ID)));
	}

	public int modify(MemberDto memberDto) {
		
		return memberDao.updateMember(memberDto);
	}

}
