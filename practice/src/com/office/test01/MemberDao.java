package com.office.test01;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	// ID 중복체크
	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);
		
		return memberDto != null ? true : false;
	}

	// 새로운 회원 가입시
	public boolean insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? true : false;
	}

	// db에서 멤버 확인
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		} else {
			return null;
		}

	}

	// modify
	public MemberDto updateMemberByMemId(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
	}

	public MemberDto deleteMemberByMemIdAndMemPw(MemberDto memberDto) {
	
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			MemberDto deletedMemberDto = db.remove(memberDto.getMemId());
			if (deletedMemberDto != null) {
				return deletedMemberDto;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	

}
