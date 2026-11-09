package com.office.member;

import java.util.Scanner;

import com.office.menu.Menu;
import com.office.session.Session;

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
		
		switch (selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			System.out.println("Input new member MAIL!!");
			memMail = scanner.next();
			System.out.println("Input new member PHONE!!");
			memPhone = scanner.next();
			
			MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
			int resultForSignUp = memberService.signUp(memberDto);
			
			// 결과를 받아 성공or실패 출력
			if (resultForSignUp == MemberService.SIGN_UP_SUCCESS) {
				System.out.println("SIGN-UP SUCCESS!!");
			} else {
				System.out.println("SIGN-UP FAIL!!");
			}
			
			break;
			
		case Menu.MEMBER_SIGN_IN:
			System.out.println("Input member ID!!");
			memId = scanner.next();
			System.out.println("Input member PW!!");
			memPw = scanner.next();
			
			MemberDto signInedMemberDto = memberService.signIn(
													new MemberDto(memId, memPw, null, null));
			
			//로그인 성공
//			if (signInedMemberDto != null) {
//				System.out.println("SIGN-UP SUCCESS!!");
//				Session.getInstance().setAttribute("signInedMemberId", signInedMemberDto.getMemId());
//			
//			//로그인 실패
//			} else {
//				System.out.println("SIGN-UP FAIL!!");
//			}
			
			break;
			
		case Menu.MEMBER_SIGN_OUT:
			break;
			
		case Menu.MEMBER_MODIFY:
			break;
		case Menu.MEMBER_DELETE:
			break;
			
		}
		
		
	}

}
