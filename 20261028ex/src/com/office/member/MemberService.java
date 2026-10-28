package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	// 속성
	MemberDB db;
	
	// 생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	
	// 메서드
	/*
	 * 회원 가입
	 */
	public void doSignUp(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next(); 
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
//		MemberDB db = new MemberDB();
		
		db.memberDB.put(memberId, member);
		
//		Member selectedMember = db.memberDB.get(memberId);
//		selectedMember.printInfo();
		db.memberDB.get(memberId).printInfo();
		
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner) {
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
//		MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
		
		// searchedMember: Member or null
		if (searchedMember != null) {
			
			if (searchedMember.memberPw.equals(memberPw)) {
				System.out.println("SIGN-IN SUCCESS!!");
				
			} else {
				System.out.println("SIGN-IN FAIL!!");
				
			}
		} else {
			System.out.println("SIGN-IN FAIL!!");
			
		}
	}
	
	/*
	 * 정보 수정
	 */
	public void doModify() {
		
	}
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete() {
		
	}

}
