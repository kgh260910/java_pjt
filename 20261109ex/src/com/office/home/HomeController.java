package com.office.home;

import java.util.Scanner;

// 프레젠테이션 로직 처리
public class HomeController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			// 로그인 하기 전 
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			
			// 로그인 후
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-READ 99.SYSTEM-OUT");
		}
		
		
		scanner.close();
		
	}

}
