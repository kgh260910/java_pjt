package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
//		new Car();  -> 변수가 없어 GC가 삭제해버린다.
		
		Car car1 = new Car();
//		car1 = null; -> GC가 삭제해버린다.
		
		Car car2 = new Car();
//		Car car3 = new String();
//		Car 는 사용자가 만든 데이터 타입이 됩니다.
		
		
		// 도트접근연산자로 객체의 속성과 기능에 접근할 수 있다.
		System.out.println(car1.color);  // Black
		System.out.println(car1.size);   // 5.2
		System.out.println(car1.displacement);  // 2000
		
		car1.drive();
		car1.stop();
		car1.parking();
		
		Car car3 = new Car();
		System.out.println("car3 color: " + car3.color);  // Black
		car3.color = "White";
		System.out.println("car3 color: " + car3.color);  // White
		
		Car car4 = new Car();
		System.out.println("car4 color: " + car4.color);  // Black
		car4 = car3;   // car4가 car3와 동일한 객체를 가리키게 됩니다.
					// car4가 원래 가르키던 객체는 사라집니다.
		System.out.println("car4 color: " + car4.color);  // White
		
		car4 = null;  // car4가 car3객체를 가르키지 않게됩니다.
		
  	}

}
