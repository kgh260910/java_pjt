package com.home.interface01;

public class CalMul implements ICalculator {
	
//	// 곱셈 연산 기초
//	public int calMul(int n1, int n2) {
//		int result = n1 * n2;
//		return result;
//		
//	}

	@Override
	public int doOperator(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

}
