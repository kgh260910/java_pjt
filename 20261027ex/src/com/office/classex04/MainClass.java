package com.office.classex04;

public class MainClass {
	
	public void printHello() {
		System.out.println("Hello~");
	}
	
	public static void main(String[] args) {   // 프로그램의 시작점일뿐 어떤 Class에도 속해있지 않습니다.
		
		Car car1 = new Car();
		car1.goForward(30);       // 30 : 파라미터, 인수
		car1.goBack();
		car1.doTest();
		
//		printHello();                          // 에러 발생
		MainClass mainClass = new MainClass();  // 객체를 생성후
		mainClass.printHello();                // 도트접근연산자로 접근한다.
       

		
	}

}
