package com.home.member;

import java.util.Scanner;

import com.home.Config;
import com.home.menu.Menu;
import com.home.session.Session;

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
			
			if (resultForSignUp == MemberService.SIGN_UP_SUCCESS) {
				System.out.println("SIGN-UP SUCCESS!!");
			} else {
				System.out.println("SIGN-UP FAIL!!");
			}
			
		case Menu.MEMBER_SIGN_IN:
			System.out.println("Input member ID!!");
			memId = scanner.next();
			System.out.println("Input member PW!!");
			memPw = scanner.next();
			
			MemberDto signInedMemberDto = memberService.signIn(new MemberDto(memId, memPw, null, null));
			
			// 로그인 성공
			if (signInedMemberDto != null) {
				System.out.println("SIGN-UP SUCCESS!!");
				Session.getInstance().setAttribute(Config.SIGNED_MEMBER_ID, signInedMemberDto.getMemId());
			} else {
				System.out.println("SIGN-UP FAIL!!");
			}
			break;
		}
		
	}

}
