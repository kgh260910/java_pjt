package com.home.interface01;

public class CalSub implements ICalculator {
	
//	// 뺄셈 기초 설계
//	public int calSub(int n1, int n2) {
//		int result = n1 - n2;
//		return result;
//	}

	@Override
	public int doOperator(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	

}
