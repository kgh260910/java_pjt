package com.office.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 + num2 = " + (num1 + num2));  // 10
		
		/*
		 * 예외 처리 : try ~ catch문
		 * 			try{...} : 문제발생가능성이 있는 코드를 넣어준다.
		 * 			catch (Exception e) {...} : 처리할 내용을 코딩한다.
		 */
		try {
			System.out.println("num1 / num2 = " + (num1 / num2));  // exception 발생
		
		} catch (Exception e) {    // e = JVM에서 만든 익셉션 객체
			System.out.println(e.getMessage());      //   / by zero
			e.printStackTrace();                  // 디테일하게 예외를 보여줍니다.
		}
		
		System.out.println("num1 - num2 = " + (num1 - num2));  // 10
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 * num2 = " + (num1 * num2));  // 0
		
		
	}

}
