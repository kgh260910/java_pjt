package com.home.object04;

public class Daeri {
	
	public String name = "Kim Daeri";
	private int money;
	
	public Daeri() {
		money = 10000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!!");
	}

}
