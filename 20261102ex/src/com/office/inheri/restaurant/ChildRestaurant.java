package com.office.inheri.restaurant;

public class ChildRestaurant 
					extends ParentRestaurant 
					implements CheckList, CheckList2 {     // CheckList의 추상메서드들을 전부 구현해야 합니다.
	
	public final static int PARENT_MENU = 1;
	public final static int CHILD_MENU = 2;
	
	
	public void makeBokkeumbap() {
		System.out.println("아들꺼! 볶음밥 만듦!!");
	}
	
	
	// 상속 후 오버라이딩(상속을 받은 메서드를 재정의한다)
//	@Override
	public void makeJajang(int menu) {
		if (menu == PARENT_MENU) {
			super.makeJajang();        // super.를 앞에 붙이면 한단계 위 클래스를 가리킵니다. -> "아빠 자장 만듦!"
		} else {
			System.out.println("아들꺼! MZ세대 자장면 만듦!!");
		}
	}
	
	@Override
	public void makeTangsuyuk() {
		System.out.println("아들꺼! 탕수육 만듦!!");
	}


	@Override
	public void checkFloor() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkToilet() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkHwagu() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
