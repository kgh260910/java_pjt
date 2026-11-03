package com.office.calculator;

public class MainClass {
	
	public static void main(String[] args) {
		
		OurCalculator ourCalculator = new OurCalculator();
		
		ourCalculator.calculate(20, 10, new CalAdd());  // 객체를 외부에서 만들어서 주입한다. => 디펜던시 인젝션
		ourCalculator.calculate(20, 10, new CalSub());  // OurCalculator 클래스에서 받는다.
		ourCalculator.calculate(20, 10, new CalMul());
		ourCalculator.calculate(20, 10, new CalDiv());
		
		
		
		/*
		// 20 10
		ourCalculator.calAdd(20, 10);
		ourCalculator.calSub(20, 10);
		ourCalculator.calMul(20, 10);
		ourCalculator.calDiv(20, 10);
		*/
		
		
	}

}
