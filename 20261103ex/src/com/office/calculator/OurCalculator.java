package com.office.calculator;

public class OurCalculator {
	
	// 덧셈 연산
	public void calAdd(int n1, int n2) {
//		int result = n1 + n2;
		CalAdd calAdd = new CalAdd();
		int result = calAdd.calAdd(n1, n2);
		System.out.println("result: " + result);
		
	}
	
	// 뺄셈 연산
	public void calSub(int n1, int n2) {
//		int result = n1 - n2;
		CalSub calSub = new CalSub();
		int result = calSub.calSub(n1, n2);
		System.out.println("result: " + result);
		
	}
	
	// 곱셈 연산
	public void calMul(int n1, int n2) {
//		int result = n1 * n2;
		CalMul calMul = new CalMul();
		int result = calMul.calMul(n1, n2);
		System.out.println("result: " + result);
		
	}
	
	// 나눗셈 연산
	public void calDiv(int n1, int n2) {
//		float result = (float)n1 / n2;
		CalDiv calDiv = new CalDiv();
		float result = calDiv.calDiv(n1, n2);
		System.out.println("result: " + result);
		
	}

}
