package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	// 속성
	MemberDB db;
	String memberMail;
	String memberPhone;
	
	int loginFailureCount = 0;
	
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
		
		/*
		 * 과제: ID 중복 체크 기능 추가
		 * 과제: 비밀번호는 8~12 문자로 표현
		 */
		
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
				loginFailureCount += 1;
				if (loginFailureCount >= 3) {
					loginFailureCount = 0;
					System.out.println("3회 실패로 나가집니다.");
					systemFlag = false;  
					
				}
				
			}
		} else {
			System.out.println("SIGN-IN FAIL!!");
			loginFailureCount += 1;
			
		}
	}
	
	/*
	 * 과제: 로그인 실패가 3회 초과면 시스템 종료
	 */
	
	/*
	 * 정보 수정
	 */
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		if ((memberId == scanner.next()) && (memberPw == scanner.next())) {
			
			System.out.println("Input changing member PW");
			memberPw = scanner.next();
			
			System.out.println("Input changing member MAIL");
			String memberMail = scanner.next(); 
			
			System.out.println("Input changing member PHONE");
			String memberPhone = scanner.next();
		} else {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
		
		Member searchedMember = db.memberDB.get(memberId);
		searchedMember.memberPw = memberPw;
		searchedMember.memberMail = memberMail;
		searchedMember.memberPhone = memberPhone;
		
		// 로깅
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
//		System.out.println(searchedMember.memberId);
//		System.out.println(searchedMember.memberPw);
//		System.out.println(searchedMember.memberMail);
//		System.out.println(searchedMember.memberPhone);
		
		/*
		 * 과제: ID, PW 인증 -> ok -> 정보수정
		 */
	}
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
		
	}

}
