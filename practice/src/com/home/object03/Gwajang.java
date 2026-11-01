package com.home.object03;

public class Gwajang {
	
	// 속성
	public String name;
	public int money;
		
	// 생성자
	public Gwajang(String name) {
		this.name = name;
		money = 2000;
	}
		
	// 메서드
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급완료!!");
	}

}
