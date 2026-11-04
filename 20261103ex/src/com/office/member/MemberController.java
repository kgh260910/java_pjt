package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		
		if (IS_DEV)
			new MemberDumy().signUpForDumy(memberService);
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				
				System.out.println("Input new member ID!!");
				String memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				String memPw = scanner.next();
				
				System.out.println("Input new member MAIL!!");
				String memMail = scanner.next();
				
				System.out.println("Input new member PHONE!!");
				String memPhone = scanner.next();
				
				MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN:
				memberService.signIn();
				break;
				
			case MODIFY:
				memberService.modify();
				break;
				
			case DELETE:
				memberService.delete();
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("GOOD BYE!!");
				break;
			
			}
			
		}
		
		scanner.close();
	}

}
