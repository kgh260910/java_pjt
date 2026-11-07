package com.home.object05;

/*
 * 싱글톤
 */

public class PayCount {
	
	private static PayCount payCount;
	private int cnt = 0;
	
	private PayCount() {
	}
	
	public static PayCount getPayCountInstance() {
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
		this.cnt = ++cnt;
	}
	
	
	
	
	

}
