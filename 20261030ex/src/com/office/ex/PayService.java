package com.office.ex;

/*
 * 월급 지급 업무 처리
 */
public class PayService {
	
	// 속성
	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	// 생성자
	public PayService() {         
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang = new Chajang();
		
//		daeri.money = 0;
		// CEO 비밀번호가 1234
		daeri.setMoney(1200000, "1234");  //사장이 대리월급을120만원으로 바꾼다.
		
		// 누구나 월급 조회
		System.out.println("김대리 월급: " + daeri.getMoney());
	}
	
	// 메서드
	public void pay(int month) {
		
		daeri.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
	}

}
