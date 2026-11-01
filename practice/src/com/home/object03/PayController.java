package com.home.object03;

import java.util.Scanner;

/*
 * 월급 지급 명령 내리기
 */

public class PayController {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		
		System.out.println("월을 입력하세요.");
		int thisMonth = scanner.nextInt();
		
		PayService payService = new PayService(name);
		payService.pay(thisMonth);
		
		scanner.close();
	}
	
	

}
