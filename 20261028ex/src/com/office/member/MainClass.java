package com.office.member;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (true) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case 1: 			// SIGN-UP
				System.out.println("Input new member ID");
				String memberId = scanner.next();
				
				System.out.println("Input new member PW");
				String memberPw = scanner.next();
				
				System.out.println("Input new member MAIL");
				String memberMail = scanner.next(); 
				
				System.out.println("Input new member PHONE");
				String memberPhone = scanner.next();
				
				break;
				
			case 2: 			// SIGN-IN
				
				break;
				
			case 3: 			// MODIFY
				
				break;
				
			case 4: 			// DELETE
	
				break;
	
			case 99: 			// SYSTEM-OUT
				systemFlag = false;
				System.out.println("Say Good bye~");
	
				break;
				
			
			
		
			}
			
		}

		scanner.close();
		
	}

}
