package com.office.member;

import java.util.Scanner;

public class MemberService implements IMemberService {
	
	MemberDao memberDao = new MemberDao();

	@Override
	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입
		if (!isMember) {
			int result = memberDao.insertNewMember(memberDto);  // 0: 실패, 1: 성공
			
			if (result == 0) {
				System.out.println("죄송합니다. 회원가입 실패입니다. 잠시 후 다시 시도해 주세요.");
			} else {
				System.out.println("회원가입에 성공했습니다.");
			}
			
		} else {
			System.out.println("이미 존재하는 ID입니다.");
		}
		
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
