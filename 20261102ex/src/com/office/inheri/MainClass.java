package com.office.inheri;

import com.office.inheri.restaurant.ChildRestaurant;
import com.office.inheri.restaurant.ParentRestaurant;

public class MainClass {
	
	public static void main(String[] args) {
		
//		ParentRestaurant parentRestaurant = new ParentRestaurant();
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		ChildRestaurant childRestaurant = new ChildRestaurant();
		childRestaurant.makeJajang();
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
		
		
	}

}
