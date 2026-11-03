package com.office.calculator;

public class CalAdd implements ICalculator {
	
	/*
	// 덧셈 연산
	private int calAdd(int n1, int n2) {  // private한 이유는 외부에서 접근x
		int result = n1 + n2;
		return result;
		//System.out.println("result: " + result);
		
	}
	*/

	@Override
	public int doOperator(int n1, int n2) {
		//int result = calAdd(n1, n2);
		int result = n1 + n2;      // 덧셈 연산을 리팩토링하여 한줄로 만듦
		return result;
	}

}
