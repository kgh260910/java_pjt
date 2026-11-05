package com.home.member02;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void excute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			switch (selectedMenuNum) {
			case SIGN_UP:
				break;
			case SIGN_IN:
				break;
			case MODIFY:
				break;
			case DELETE:
				break;
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("시스템 종료");
				break;
			}
			
		}
		
		
		scanner.close();
	}

}
