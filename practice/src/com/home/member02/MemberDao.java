package com.home.member02;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	// 아이디 중복 체크에 사용
	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);
	
		return memberDto != null ? true : false;
	}

	// 새로운 회원 가입시 사용
	public int insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? 1 : 0;
	}

	// 로그인 시 확인
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto !=null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		} else {
			return null;
		}
	}

	public MemberDto updateMemberByMemId(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
	}		

}
