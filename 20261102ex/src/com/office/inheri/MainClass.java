package com.office.inheri;

import com.office.inheri.restaurant.ChildRestaurant;
import com.office.inheri.restaurant.ParentRestaurant;

public class MainClass {
	
	public static void main(String[] args) {
		
//		ParentRestaurant parentRestaurant = new ParentRestaurant();
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		
		// 상속 후 메서드 사용
		ChildRestaurant childRestaurant = new ChildRestaurant();
		childRestaurant.makeJajang(ChildRestaurant.PARENT_MENU);   
		childRestaurant.makeJajang(ChildRestaurant.CHILD_MENU);
		childRestaurant.makeJjamppong();      // 아들메서드를 먼저 찾은다음 없으면 아빠클래스로 가서 찾는다.
		childRestaurant.makeBokkeumbap();
		childRestaurant.makeTangsuyuk();
		
	}

}
