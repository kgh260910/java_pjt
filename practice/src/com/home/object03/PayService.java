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
	public PayService(String name, int position) {
		
		if (position == 1)
			daeri = new Daeri(name);
		else if (position == 2)
			gwajang = new Gwajang(name);
		else if (position == 3)
			chajang = new Chajang(name);
		
	}
	
	
	// 메서드
	public void pay(int month, int position) {
		
		if (position == 1)
			daeri.pay();
		else if (position == 2)
			gwajang.pay();
		else if (position == 3)
			chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
		
		
	}
	
	
	
	

}
