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
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 99:
				break;
			}
		}
		
		scanner.close();
		
	}

}
