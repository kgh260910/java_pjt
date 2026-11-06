package com.office.test01;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		System.out.println("1.SIGN-UP 2.SIGN-IN 3.SIGN-OUT 4.MODIFY 5.DELETE 99.SYSTEM-OUT");
			
		while (systemFlag) {
			
			int selectedMenuNum = scanner.nextInt();
			
			switch(selectedMenuNum) {
			case SIGN_UP:
				System.out.println("Input new member ID!!");
				memId = scanner.next();
				System.out.println("Input new member PW!!(최소 4자리가 필요합니다)");
				memPw = scanner.next();
				if (memPw.length() < MIN_LENGTH) {
					System.out.println("비밀번호가 4자리 미만입니다. 메뉴로 돌아갑니다.");
					memId = null;
					memPw = null;
					ViewPoint.getInstance().getView(START);
					continue;
				}
				System.out.println("Input new member MAIL!!");
				memMail = scanner.next();
				System.out.println("Input new member PHONE!!");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				ViewPoint.getInstance().getView(SIGN_UP);
				break;
				
			case SIGN_IN:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
	
				memberService.signIn(memberDto);
				
				ViewPoint.getInstance().getView(SIGN_IN);
				break;
				
			case SIGN_OUT:
				
				ViewPoint.getInstance().getView(SIGN_OUT);
				break;
				
			case MODIFY:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				boolean isAuthentication = memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if (isAuthentication) {
					System.out.println("Input member PW!!");
					memPw = scanner.next();
					System.out.println("Input member MAIL!!");
					memMail = scanner.next();
					System.out.println("Input member PHONE!!");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
					
				}
				
				ViewPoint.getInstance().getView(MODIFY);
				break;
				
			case DELETE:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				memberService.delete(memberDto);
				
				ViewPoint.getInstance().getView(DELETE);
				break;			
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("시스템 종료합니다.");
				
				ViewPoint.getInstance().getView(SYSTEM_OUT);
				break;
		
			}
		}
		
		
		scanner.close();
	}

}
