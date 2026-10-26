package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 1, 20, "Computer");
		Student student2 = new Student("박찬호", 1, 21, "Sports");
		
		/*
		System.out.println("name: " + student1.name);		// 홍길동
		System.out.println("grade: " + student1.grade);		// 1
		System.out.println("age: " + student1.age);			// 20
		System.out.println("major: " + student1.major);		// 컴퓨터
		*/
		
		student1.printInfo();
		student2.printInfo();
		
		Student student3 = new Student("김경문", 2, 22, "Baseball");
	}

}
