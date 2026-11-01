package com.home.object03;

public class PayService {
	
	/*
	 * 월급 지급 업무 처리
	 */
	
	// 멤버필드
	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	
	// 생성자
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang =new Chajang();
	}
	
	
	// 메서드
	public void pay(int month) {
		
		daeri.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
		
		
	}
	
	
	
	

}
