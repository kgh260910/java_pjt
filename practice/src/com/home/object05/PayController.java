package com.home.object05;

import java.util.Scanner;

/*
 * 월급 지급 명령내리기
 */

public class PayController {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("월을 쓰세요.");
			int thisMonth = scanner.nextInt();
			
			PayService payService = new PayService();
			payService.pay(thisMonth);
			
		}
	}

}
