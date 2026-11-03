package com.home.interface01;

public class MainClass {
	
	public static void main(String[] args) {
		
		OurCalculator ourCalculator = new OurCalculator();
		
		ourCalculator.calculate(20, 10, new CalAdd());
		ourCalculator.calculate(20, 10, new CalSub());
		ourCalculator.calculate(20, 10, new CalMul());
		
//		ourCalculator.calAdd(20, 10);
//		ourCalculator.calSub(20, 10);
//		
	}

}
