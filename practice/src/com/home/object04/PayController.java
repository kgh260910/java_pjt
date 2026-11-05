package com.home.object04;

import java.util.Scanner;

public class PayController {
	
	private PayService payService;
	private boolean systemFlag = true;
	
	public PayController(PayService payService) {
		this.payService = payService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (systemFlag) {
			System.out.println("Please enter the month");
			
			int thisMonth = scanner.nextInt();
			
			payService.pay(thisMonth);
			
		}
		
		scanner.close();
	}

}
