package com.office.calculator;

public class CalAdd implements ICalculator {
	
	// 덧셈 연산
	public int calAdd(int n1, int n2) {
		int result = n1 + n2;
		return result;
		//System.out.println("result: " + result);
		
	}

	@Override
	public int doOperator(int n1, int n2) {
		int result = calAdd(n1, n2);
		return result;
	}

}
