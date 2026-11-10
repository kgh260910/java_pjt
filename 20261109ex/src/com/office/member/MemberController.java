package com.office.member;

import java.util.Scanner;

import com.office.config.Config;
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
			if (signInedMemberDto != null) {
				System.out.println("SIGN-UP SUCCESS!!");
				Session.getInstance().setAttribute(Config.SIGNED_MEMBER_ID, signInedMemberDto.getMemId());
			
			//로그인 실패
			} else {
				System.out.println("SIGN-UP FAIL!!");
			}
			
			break;
			
		case Menu.MEMBER_SIGN_OUT:
			
			Session.getInstance().removeAttribute(Config.SIGNED_MEMBER_ID); // 세션활용
			
			break;
			
		case Menu.MEMBER_MODIFY:
			
			MemberDto signInedMember = memberService.getMember();
			
			System.out.println("MemberID: " + signInedMember.getMemId());
			System.out.println("MemberPW: " + signInedMember.getMemPw());
			System.out.println("MemberMAIL: " + signInedMember.getMemMail());
			System.out.println("MemberPHONE: " + signInedMember.getMemPhone());
			
			System.out.println("Input member new PW!!");
			memPw = scanner.next();
			System.out.println("Input member new MAIL!!");
			memMail = scanner.next();
			System.out.println("Input member new PHONE!!");
			memPhone = scanner.next();
			
			int resultForModify = memberService.modify(new MemberDto(
					String.valueOf(Session.getInstance().getAttribute(Config.SIGNED_MEMBER_ID)),
					memPw,
					memMail,
					memPhone));
			
			if (resultForModify == MemberService.MODIFY_SUCCESS) {
				System.out.println("MEMBER UPDATE SUCCESS!!");
			} else {
				System.out.println("MEMBER UPDATE FAIL!!");
			}
			break;
			
		case Menu.MEMBER_DELETE:
			
			int resultForDelete = memberService.delete(
					String.valueOf(Session.getInstance().getAttribute(Config.SIGNED_MEMBER_ID)));
			
			if (resultForDelete == MemberService.DELETE_SUCCESS) {
				System.out.println("Member DELETE SUCCESS!!");
				Session.getInstance().removeAttribute(Config.SIGNED_MEMBER_ID);  // 세션 제거하기
				
			} else {
				System.out.println("Member DELETE FAIL!!");
			}
			break;
			
		}
		
		
	}

}
