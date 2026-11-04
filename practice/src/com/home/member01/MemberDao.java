package com.home.member01;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);
		
		return memberDto != null ? true : false;
	
	}

	public int insertNewMember(MemberDto memberDto) {
	
		db.put(memberDto.getMemId(), memberDto);
		
		return db.put(memberDto.getMemId(), memberDto) != null ? 1 : 0;
	}
	
	

}
