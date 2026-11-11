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
			System.out.println("num1 / num2 = " + (num1 / num2));  // exception 발생, catch쪽으로 넘어간다.
			System.out.println("num1 - num2 = " + (num1 - num2));  // 실행되지 않음.
			
		} catch (NullPointerException e) {    // e = JVM에서 만든 익셉션 객체
			System.out.println(e.getMessage());      //   / by zero
			e.printStackTrace();                  // 디테일하게 예외를 보여줍니다.
			
		} catch (ArithmeticException e) {     // 여러개의 catch를 사용해서 예외처리가 가능합니다.
			e.printStackTrace();			  // 다중 catch를 사용해 분기를 태울 수 있습니다.
			                                  // ArithmeticException에 해당하는 예외여서 여기catch에 걸립니다.
			
		} catch (Exception e) {              // 맨 마지막에는 항상 Exception e가 들어갑니다.
			e.printStackTrace();             // 위에서 먼저 사용된 catch가 있다면 나머지 catch들은 무시됩니다.
			
		} finally {                          // (생략가능)try내부의 예외발생과 무관하게 항상 코드가 실행된다. 
			System.out.println("finally");
		}
		
		System.out.println("num1 - num2 = " + (num1 - num2));  // 10
		System.out.println("num1 * num2 = " + (num1 * num2));  // 0
			
	}

}
