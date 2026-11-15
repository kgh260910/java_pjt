package com.home.member;

import java.util.HashMap;
import java.util.Map;

import com.home.db.DiaryDb;

public class MemberDao {
	
	final private DiaryDb diaryDb;

	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

	//아이디 존재유무 확인
	public boolean isMember(String memId) {
		
		Map<String, MemberDto> members = diaryDb.getMembers();
		MemberDto memberDto = members.get(memId);

		return memberDto !=null ? true : false;
	}

	// 회원가입
	public int insertMember(MemberDto memberDto) {
	
		Map<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		
		return members.get(memberDto.getMemId()) != null
				?
				MemberService.SIGN_UP_SUCCESS
				:
				MemberService.SIGN_UP_FAIL;
	}

	public MemberDto selectedMemberByMemId(String memId) {
		
		Map<String, MemberDto> members = diaryDb.getMembers();
		
		return members.get(memId) != null ? members.get(memId) : null;
	}

	public int updateMember(MemberDto memberDto) {
		
		Map<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		
		return members.get(memberDto.getMemId()) != null
				?
				MemberService.MODIFY_SUCCESS
				:
				MemberService.MODIFY_FAIL;
	}
	


	

}
