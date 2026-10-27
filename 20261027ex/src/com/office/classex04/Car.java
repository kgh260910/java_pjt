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
	public void goForward() {     // 접근제한자 반환형 메서드명() {}
		System.out.println("--- goForward() method ---");
	}

	public void goBack() {
		System.out.println("--- goBack() method ---");
	}
}
