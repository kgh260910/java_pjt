package com.office.member;

import java.util.HashMap;

public class MemberDao {
	
	/*
	 * gildong : MemberDto
	 */
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);
		
		return memberDto != null ? true : false;
		
//		if (memberDto != null)
//			return true;
//		else 
//			return false;	
	}

	public int insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? 1 : 0;   // 0 or 1
	}

}
