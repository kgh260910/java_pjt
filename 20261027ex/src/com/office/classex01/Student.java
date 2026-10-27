package com.office.classex01;

public class Student {
	
	// 속성 == attribute == 멤버필드(*)
	String name;		// 이름
	int grade;			// 학년
	int age;			// 나이
	String major;		// 전공
	
	// 생성자  // ctrl+space bar로 자동완성기능 사용해서 만드는 것이 편하다.
	public Student(
			String name,
			int grade,
			int age,
			String major) {
		System.out.println("-- CONSTRUCTOR --");
		
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
	}
	
	// 기능 == 메서드(*)
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Age: " + age);
		System.out.println("Major: " + major);
		
	}
}
