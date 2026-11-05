package com.home.object04;

/*
 * 월급 지급 업무 처리
 */

public class PayService {
	
	private Daeri daeri;
	private Gwajang gwajang;
	
	public PayService(Daeri daeri, Gwajang gwajang) {
		this.daeri = daeri;
		this.gwajang = gwajang;
	}
	
	public void pay(int month) {
		
		this.daeri.pay();
		this.gwajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
	}
	
	

}
