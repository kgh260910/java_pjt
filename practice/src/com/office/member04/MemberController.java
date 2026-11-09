package com.office.member04;

import java.util.Scanner;

public class MemberController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		
		while(systemFlag) {
			
			System.out.println("1.SING-UP 2.SIGN-IN 3.MODIFY 4.DELETE 99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
		
			switch(selectedMenuNum) {
			//1.회원가입
			case 1:
				System.out.println("Input new member ID!!");
				String memId = scanner.next();
				System.out.println("Input new member PW!!");
				String memPw = scanner.next();
				System.out.println("Input new member Mail!!");
				String memMail = scanner.next();
				System.out.println("Input new member Phone!!");
				String memPhone = scanner.next();
				
				MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				memberService.signUp(memberDto);
				
				break;
			//2.로그인
			case 2:
				break;
			//3.정보수정
			case 3:
				break;
			//4.회원삭제
			case 4:
				break;
			//99.시스템 종료
			case 99:
				systemFlag = false;
				System.out.println("시스템 종료");
				break;
			}
		}
		
		scanner.close();
		
	}

}
