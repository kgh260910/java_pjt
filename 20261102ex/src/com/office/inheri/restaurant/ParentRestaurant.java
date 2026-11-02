package com.office.inheri.restaurant;

// abstract가 붙은 class = 추상클래스
public abstract class ParentRestaurant {
	
	// 메서드
	public void makeJajang() {
		System.out.println("아빠꺼! 자장면 만듦!!");
	}
	
	public void makeJjamppong() {
		System.out.println("아빠꺼! 짬뽕 만듦!!");
	}
	
	// 탕수육 만드는 기술 반드시 익혀라!
	// abstract가 포함된 메서드 = 추상메서드
	public abstract void makeTangsuyuk(); 

}
