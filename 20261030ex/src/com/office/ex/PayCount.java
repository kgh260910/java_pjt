package com.office.ex;


/*
 * 싱글턴 클래스로 만들자!
 */
public class PayCount {
	
	// 속성
	private static PayCount payCount = null;
	private int cnt = 0;
	
	// 생성자
	private PayCount() {
		
	}
	
	
	// 메서드
	public static PayCount getPayCountInstance() { // 객체가 0개일때도 static메서드에 접근이 가능하다.
		if (payCount == null) {
			payCount = new PayCount();
		}
		return payCount;
	}


	// 조회
	public int getCnt() {
		return cnt;
	}

	// 설정(초기화)
	public void setCnt() {
		this.cnt++;
	}
	
	
	

}
