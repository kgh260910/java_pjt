package com.office.methodex;

public class Calculator {
	
	public int addOperator(int n1, int n2) {
		
		int result = n1 + n2;
//		System.out.println("result: " + result);
		
		return result;
		
	}
	/*
	public Car productCar() {
		
		Car car = new Car();
		return car;
		
	}
	*/
	public Car productCar() {       // 반환하는 타입이 Object면
									// 호출부는 무조건 Object여야 한다!!!
		Car car = new Car();        // 반환하는 타입이 Car이면
		return car;                 // 호출부에서는 Object와 Car로 받을 수 있다.
	}
}
