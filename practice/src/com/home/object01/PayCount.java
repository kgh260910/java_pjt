package com.home.object01;

public class PayCount {
	
	
	// 속성
	private static PayCount paycount = null;
	private int cnt = 0;

	// 생성자
	private PayCount() {
		
	}
	
	// 메서드
	public static PayCount getPayCountInstance() {
		if (paycount == null) {
			paycount = new PayCount();
		}
		return paycount;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt() {
//	public int setCnt() {
//		cnt++;
//		return cnt;
		this.cnt++;
	}
	
	
	
	
}
