package com.home.object04;

public class Daeri implements Employee {
	
	public String name = "Kim Daeri";
	private int money;
	
	public Daeri() {
		money = 10000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!!");
	}

	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money, String ceoPw) {
		if (ceoPw.equals("1234")) {
			this.money = money;
			System.out.println("급여가" + money + "원으로 변경되었습니다.");
		}
	}
	
	
	

}
