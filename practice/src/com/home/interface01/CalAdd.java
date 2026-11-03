package com.home.interface01;

public class CalAdd implements ICalculator {
	
	// 덧셈 연산 기초설계
//	public int calAdd(int n1, int n2) {
//		int result = n1 + n2;
//		return result;
//	}

	@Override
	public int doOperator(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
