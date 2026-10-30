package com.home.object01;

public class Daeri {
	
	// 속성
	private String name = "Kim Daeri";
	private int money;
	
	// 생성자
	public Daeri() {
		money = 1000000;
	}
	
	
	// 메서드
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!!");
	}

}
