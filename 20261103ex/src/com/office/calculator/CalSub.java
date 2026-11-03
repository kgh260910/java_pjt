package com.office.calculator;

public class CalSub implements ICalculator {
	
	/*
	// 뺄셈 연산
	private int calSub(int n1, int n2) {
		int result = n1 - n2;
		return result;
//		System.out.println("result: " + result);
			
	}
	*/

	@Override
	public int doOperator(int n1, int n2) {
//		int result = calSub(n1, n2);
		int result = n1 - n2;
		return result;
	}

}
