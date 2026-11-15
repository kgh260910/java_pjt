package com.home.dumy;

import com.home.Container;
import com.home.member.MemberDto;

public class Dumy {
	
	private String[] memIds = {"gildong", "chanho"};
	private String[] memPws = {"1234", "5678"};
	private String[] memMails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] memPhones = {"010-1234-5678", "010-1234-1111"};
	
	public void setDumy() {
		
		for (int i = 0; i < memIds.length; i++) {
			
			MemberDto memberDto = 
					new MemberDto(memIds[i], memPws[i], memMails[i], memPhones[i]);
			
			Container.getInstance().getMemberService().signUp(memberDto); // 회원가입
		}
	}

}
