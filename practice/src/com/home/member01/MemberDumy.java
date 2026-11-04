package com.home.member01;

public class MemberDumy {
	
	private String[] memIds = {"qwer", "asdf"};
	private String[] memPws = {"1234", "5555"};
	private String[] memMails = {"qwer@gmail.com", "asdf@naver.com"};
	private String[] memPhones = {"010-1234-5678", "010-1111-2222"};
	
	public void signUpForDumy(MemberService memberService) {
		
		for (int i = 0; i < memIds.length; i++) {
			MemberDto memberDto = 
					new MemberDto(
							memIds[i],
							memPws[i],
							memMails[i],
							memPhones[i]);
					
			memberService.signUp(memberDto);
		}
		
	}


}
