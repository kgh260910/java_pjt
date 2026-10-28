package com.office.member;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		final int MEMBER_SIGN_UP = 1;
		final int MEMBER_SIGN_IN = 2;
		final int MEMBER_MODIFY = 3;
		final int MEMBER_DELETE = 4;
		final int MEMBER_LIST_ALL = 5;
		final int SYSTEM_OUT = 99;
		
		Scanner scanner = new Scanner(System.in);
		
		Flag systemFlag = new Flag();
		int selectedMenu = 0;
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		if (DevDatabaseConfig.IS_DEV) {
			
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		
		}
		
		/*
		 * 과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
		while (true) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
//			int selectedMenu = scanner.nextInt();
			selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case MEMBER_SIGN_UP: 			// SIGN-UP
//				memberService = new MemberService();
				memberService.doSignUp(scanner);
			
				break;
				
			case MEMBER_SIGN_IN: 			// SIGN-IN
//				memberService = new MemberService();
				memberService.doSignIn(scanner);
				
				break;
				
			case MEMBER_MODIFY: 			// MODIFY
				
				memberService.doModify(scanner);
				
				break;
				
			case MEMBER_DELETE: 			// DELETE
				
				memberService.doDelete(scanner);
	
				break;
				
			case MEMBER_LIST_ALL:				// 전체 회원 정보 출력
				
				break;
	
			case SYSTEM_OUT: 			// SYSTEM-OUT
				systemFlag = false;
				System.out.println("Say Good bye~");
	
				break;
			
			/*
			 * 과제: case에 사용되는 리터럴 상수 -> 상수 변경하세요.
			 * 과제: 메뉴 5번 -> 전체 회원 정보 출력하는 기능 구현하세요.(AI도움ok)
			 */
			
			
		
			}
			
		}

	
		
	}

}
