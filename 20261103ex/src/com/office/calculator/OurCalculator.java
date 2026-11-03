package com.office.calculator;

public class OurCalculator {
	
	// 덧셈 연산
	public void calAdd(int n1, int n2) {
//		int result = n1 + n2;
		ICalculator iCalculator = new CalAdd();      // ICalculator를 쓴 이유:호환성이 좋아진다.
		int result = iCalculator.doOperator(n1, n2);
//		int result = calAdd.calAdd();
		System.out.println("result: " + result);
		
	}
	
	// 뺄셈 연산
	public void calSub(int n1, int n2) {
//		int result = n1 - n2;
		ICalculator iCalculator = new CalSub();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
		
	}
	
	// 곱셈 연산
	public void calMul(int n1, int n2) {
//		int result = n1 * n2;
		ICalculator iCalculator = new CalMul();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
		
	}
	
	// 나눗셈 연산
	public void calDiv(int n1, int n2) {
//		float result = (float)n1 / n2;
		ICalculator iCalculator = new CalDiv();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
		
	}

}
