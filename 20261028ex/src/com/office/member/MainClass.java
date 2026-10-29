package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
				
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
	
		int selectedMenu = 0;
		
		MemberDB memberDB = new MemberDB();
		Flag flag = new Flag();
		
		MemberService memberService = new MemberService(memberDB, flag);
		
		if (config.IS_DEV) {
			
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		
		}
		
		/*
		 * v과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
		while (flag.systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.PRINT ALL MEMBER    99.SYSTEM-OUT");
//			int selectedMenu = scanner.nextInt();
			selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.MENU_SIGN_UP: 			// SIGN-UP
//				memberService = new MemberService();
				memberService.doSignUp(scanner);
			
				break;
				
			case Menu.MENU_SIGN_IN: 			// SIGN-IN
//				memberService = new MemberService();
				memberService.doSignIn(scanner);
				
				break;
				
			case Menu.MENU_MODIFY: 			// MODIFY
				
				memberService.doModify(scanner);
				
				break;
				
			case Menu.MENU_DELETE: 			// DELETE
				
				memberService.doDelete(scanner);
	
				break;
				
			case Menu.MENU_PRINT_ALL_MEMBER:				// 전체 회원 정보 출력
				
				HashMap<String, Member> db = memberDB.memberDB;
				
//				db.keySet();  // 키 값만 얻기
				for (String key : db.keySet()) {
					Member member = db.get(key);
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
//				db.values();  // 밸류 값만 얻기
				for (Member member : db.values()) {
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				break;
	
			case Menu.MENU_SYSTEM_OUT: 			// SYSTEM-OUT
				flag.systemFlag = false;
				System.out.println("Say Good bye~");
	
				break;
			
			/*
			 * v과제: case에 사용되는 리터럴 상수 -> 상수 변경하세요.
			 * 과제: 메뉴 5번 -> 전체 회원 정보 출력하는 기능 구현하세요.(AI도움ok)
			 */
			
			
		
			}
			
		}

	
		
	}

}
