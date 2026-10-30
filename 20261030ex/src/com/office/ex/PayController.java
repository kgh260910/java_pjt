package com.office.ex;

import java.util.Scanner;

/*
 * 월급 지급 명령을 내린다.
 */
public class PayController {
	
	// 메서드
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please enter the month;");
			int thisMonth = scanner.nextInt();
			
			PayService payService = new PayService();  // PayService객체를 만든다.
			payService.pay(thisMonth); 					// PayService의 메서드를 사용한다.
			
		}
		
//		scanner.close();
	}

}
