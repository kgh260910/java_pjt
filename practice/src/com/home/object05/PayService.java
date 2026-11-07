package com.home.object05;

/*
 * 월급 지급 업무 처리
 */


public class PayService {
	
	Daeri daeri;
	Gwajang gwajang;
	
	public PayService() {
		this.daeri = new Daeri();
		this.gwajang = new Gwajang();
	}
	
	
	public void pay(int month) {
		
		daeri.pay();
		gwajang.pay();
		System.out.println(month + "월 급여 지급 완료!!");
		
		PayCount.getPayCountInstance().setCnt();
		int cnt = PayCount.getPayCountInstance().getCnt();
		System.out.println("누적 급여 횟수: " + cnt);
		
	}
	
	
	
	
	
	
	 
	 

}
