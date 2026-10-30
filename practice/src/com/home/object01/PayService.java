package com.home.object01;

public class PayService {
	
	// 속성
	Daeri daeri;
	Gwajang gwajang;
	
	
	// 생성자
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
	}
	
	
	// 메서드
	public void pay(int month) {
		
		daeri.pay();
		gwajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
		
		PayCount.getPayCountInstance().setCnt();
		
		int cnt = PayCount.getPayCountInstance().getCnt();
		System.out.println("누적 급여 횟수: " + cnt);
		
		
		
	}

}
