package com.office.ex;

/*
 * 월급 지급 업무 처리
 */
public class PayService {
	
	// 속성
	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang = new Chajang();
	}
	
	public void pay(int month) {
		
		daeri.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
	}

}
