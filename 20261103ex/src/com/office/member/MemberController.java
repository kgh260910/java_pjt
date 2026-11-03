package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
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
				break;
			
			}
			
		}
		
		scanner.close();
	}

}
