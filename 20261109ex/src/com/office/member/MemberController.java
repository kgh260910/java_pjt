package com.office.member;

public class MemberController {
	
	final private MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

}
