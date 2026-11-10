package com.office.member;

import com.office.config.Config;
import com.office.session.Session;

public class MemberService {
	
	final private MemberDao memberDao;
	
	final public static int SIGN_UP_FAIL = 0;
	final public static int SIGN_UP_SUCCESS = 1;
	
	final public static int MODIFY_FAIL = 0;
	final public static int MODIFY_SUCCESS = 1;
	
	final public static int DELETE_FAIL = 0;
	final public static int DELETE_SUCCESS = 1;
	
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

	public MemberDto getMember() {
		
		return memberDao.selectedMemberByMemId(
				String.valueOf(Session.getInstance().getAttribute(Config.SIGNED_MEMBER_ID)));
	}

	public int modify(MemberDto memberDto) {
		
		return memberDao.updateMember(memberDto);
	}

	public int delete(String memId) {
		
		return memberDao.deleteByMemId(memId);

	}

}
