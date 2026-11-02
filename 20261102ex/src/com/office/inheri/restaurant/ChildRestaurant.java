package com.office.inheri.restaurant;

public class ChildRestaurant extends ParentRestaurant {
	
	public void makeBokkeumbap() {
		System.out.println("아들꺼! 볶음밥 만듦!!");
	}
	
	
	// 상속 후 오버라이딩(상속을 받은 메서드를 재정의한다)
	@Override
	public void makeJajang() {
		System.out.println("아들꺼! MZ세대 자장면 만듦!!");
	}

}
