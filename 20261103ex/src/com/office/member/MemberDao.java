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
	}

}
