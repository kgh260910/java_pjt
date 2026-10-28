package com.office.classex04;

public class Car {
	
	// 멤버필드
	String color;
	int length;
	int price;
	int displacement;
	
	// 생성자
	public Car() {
		System.out.println("--- CONSTRUCTOR ---");
	}

	public Car(
		String color,
		int length,
		int price,
		int displacement) {
		this.color = color;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	// 메서드
	// int speed : parameter, 매개변수-호출부와 선언부의 관계를 이어줘서 '매개'
	public void goForward(int speed) {     // 접근제한자 반환형 메서드명() {}
		System.out.println("--- goForward() method ---");
		System.out.println(speed + "km/h");
	}

	public void goBack() {
		System.out.println("--- goBack() method ---");
	}
	
	public void doTest() {
		goForward(30);  // == this.goForward();
		goBack();     // == this.goBack();
	}
}
