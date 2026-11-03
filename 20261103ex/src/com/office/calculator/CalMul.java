package com.office.calculator;

public class CalMul implements ICalculator {
	
	// 곱셈 연산
	public int calMul(int n1, int n2) {
		int result = n1 * n2;
		return result;
//		System.out.println("result: " + result);
			
	}

	@Override
	public int doOperator(int n1, int n2) {
		
		return 0;
	}

}
