package com.office.ex;

/*
 * 월급 지급 업무 처리
 * 
 * 누적된 급여 지급 횟수
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
		
		PayCount.getPayCountInstance().setCnt(); // PayCount클래스의 get~메서드와 setCnt메서드를 연달아 호출한다.
		
		// 누적 급여 횟수 출력
		int cnt = PayCount.getPayCountInstance().getCnt();
		System.out.println("누적 급여 횟수: " + cnt);
	}

}
