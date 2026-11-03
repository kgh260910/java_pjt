package com.home.interface01;

public class OurCalculator {
	
	public void calculate(int n1, int n2, ICalculator iCalculator) {
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
	}
	
	
	// 덧셈 연산
//	public int calAdd(int n1, int n2) {
//		CalAdd calAdd = new CalAdd();
//		int result = calAdd.calAdd(n1, n2);
//		System.out.println("result: " + result);
//		return result;
//	}
//	
//	
//	// 뺄셈 연산
//	public int calSub(int n1, int n2) {
//		CalSub calSub = new CalSub();
//		int result = calSub.calSub(n1, n2);
//		System.out.println("result: " + result);
//		return result;
//	}

}
