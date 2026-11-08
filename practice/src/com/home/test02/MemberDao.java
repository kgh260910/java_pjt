package com.home.test02;

import java.util.HashMap;

public class MemberDao {
	
	final private DiaryDb diaryDb;
	
	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

	public boolean isMember(String memId) {
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		MemberDto memberDto = members.get(memId);
		
		return memberDto != null ? true : false;
	}

	public int insertMember(MemberDto memberDto) {
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		
		members.put(memberDto.getMemId(), memberDto);
		
		return members.get(memberDto.getMemId()) != null
				?
				1
				:
				0;

	}
	
	
	

}
