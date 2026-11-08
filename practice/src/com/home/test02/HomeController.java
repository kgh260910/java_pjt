package com.home.test02;

import java.util.Scanner;

public class HomeController {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			
			int selectedMenu = scanner.nextInt();
			switch (selectedMenu) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				Container.getInstance().getMemberController().execute(scanner, selectedMenu);
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			case 99:
				systemFlag = false;
				System.out.println("시스템 종료");
				break;
			}
			
			
		}
		
		scanner.close();
	}

}
