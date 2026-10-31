package com.home.object02;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Car carName = new Car();
//		
//		carName.printCarName();
		
		Calculator calculator = new Calculator();
		
		int result = calculator.addOperator(10, 30);
		
		// calculator를 이용해서 자동차 하나를 가지고 싶다.
		Car myCar = calculator.productCar();
		
		
	}

}
