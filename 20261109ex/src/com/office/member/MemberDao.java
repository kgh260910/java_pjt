package com.office.member;

import java.util.HashMap;

import com.office.db.DiaryDb;

public class MemberDao {
	
	final private DiaryDb diaryDb;
	
	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}
	
	
	// 아이디 존재 유무 확인
	public boolean isMember(String memId) {

		HashMap<String, MemberDto> members = diaryDb.getMembers();
		MemberDto memberDto = members.get(memId);
		
		return memberDto !=null ? true : false;
	}

	// 회원가입
	public int insertMember(MemberDto memberDto) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		
//put값을 반환받기 위해 즉시 =(할당연산자)를 쓰게 되면 이전값이 반환되어서 null이 된다. => 이 방법은 사용하지 않는다.
//		MemberDto memberDto2 = members.put(memberDto.getMemId(), memberDto);
		
		return members.get(memberDto.getMemId()) != null
				?
				MemberService.SIGN_UP_SUCCESS
				: 
				MemberService.SIGN_UP_FAIL;
	}
	
	
	public int updateMember(MemberDto memberDto) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		
		return members.get(memberDto.getMemId()) != null
				?
				MemberService.MODIFY_SUCCESS
				: 
				MemberService.MODIFY_FAIL;
	}

	// 로그인시 중복 확인
	public MemberDto selectedMemberByMemId(String memId) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		
		return members.get(memId) != null ? members.get(memId) : null;
	}

}
