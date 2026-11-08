package com.home.test02;

import java.util.Scanner;

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
		case 1:
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			System.out.println("Input new member ID!!");
			memPw = scanner.next();
			System.out.println("Input new member ID!!");
			memMail = scanner.next();
			System.out.println("Input new member ID!!");
			memPhone = scanner.next();
			
			int resultForSignUp = memberService.signUp(new MemberDto(memId, memPw, memMail, memPhone));
			/*
			 * 가입성공확인 추가필요
			 */
			
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
			
		
			
		}
		
	}

}
