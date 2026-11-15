package com.home.member;

import java.util.Scanner;

import com.home.menu.Menu;

public class MemberController {
	
	final private MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	public void execute(Scanner scanner, int selectedMenu) {
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		switch(selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			System.out.println("Input new member Mail!!");
			memMail = scanner.next();
			System.out.println("Input new member Phone!!");
			memPhone = scanner.next();
			
			MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
			int resultForSignUp = memberService.signUp(memberDto);
			
			
		}
		
	}

}
