package com.home.object01;

import java.util.Scanner;

public class PayController {
	
	// 속성
	
	// 생성자
	
	// 메서드
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1.급여지급    99.시스템종료");
			int menuSelected = scanner.nextInt();
			
			if (menuSelected == 1) {
				System.out.println("이번 달을 입력하세요.");
				int thisMonth = scanner.nextInt();
			
				PayService payService = new PayService();
				payService.pay(thisMonth);
				
			} else if (menuSelected == 99) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 접근입니다. 올바른 메뉴를 선택해주세요.");
			}
		
		
		
		}
		
		scanner.close();
		
	}
	

}
