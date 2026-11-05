package com.home.object04;

/*
 * 싱글턴 클래스 만들기
 */

public class PayCount {
	
	private static PayCount payCount = null;
	private int cnt = 0;
	
	private PayCount() {
		
	}

	
	public static PayCount getPayCountInstance() {
		if (payCount == null) {
			payCount = new PayCount();
			System.out.println("싱글턴 클래스 성공!");
		} else {
			System.out.println("싱글턴이 이미 있습니다.");
		}
		return payCount;
	}
	
	

}
