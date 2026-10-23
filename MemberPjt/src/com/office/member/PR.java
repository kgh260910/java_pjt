package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class PR {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		HashMap<String, String[]> members = new HashMap<String, String[]>();
		
		
		while (systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.END");
			
			int selectedMenuNumber = scanner.nextInt();
			
			String memberID;
			String memberPW;
			String memberMail;
			String memberPhone;
			
			switch (selectedMenuNumber) {
			
			case 1:					//SIGN-UP(회원가입)
				
				break;
			case 2:					//SIGN-IN(로그인)
				
				break;
			case 3:					//MODIFY(정보수정)
	
				break;
			case 4:					//DELETE(회원탈퇴)
				
				break;
			case 99:				//시스템 종료
				break;	
				
				
			}
			
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
		/*
		int[] number1 = {1, 2, 3};
		int[] number2 = new int[3];
		number2[0] = 1;
		number2[1] = 1;
		number2[2] = 1;
		int[] number3 = new int[] {3, 2, 1};
		
		System.out.println(number1[1]);
		System.out.println(number2[1]);
		System.out.println(number3[0]);
		
		for(int i = 0; i < number1.length; i++) {
			System.out.println(number1[i]);
			System.out.printf("number1: %d\n", number1[i]);
			System.out.printf("number1[%d]: %d\n", i, number1[i]);
		}
		
//		foreach
		int[] scores = {80, 90, 100, 75, 60};
		
		for(int score : scores) {
			System.out.println("score: " + score);
		}
		String[] hello = {"H", "E", "L", "L", "O"};
		for(String str1 : hello) {
			System.out.println(str1);
		
		}
		
		int[] studentScores = {80, 90, 100, 90};
		int total = 0;
		float average = 0.0f;
		
		for (int i = 0; i < studentScores.length; i++) {
			System.out.printf("studentScores[%d] score: %d \n", i, studentScores[i]);
			total += studentScores[i];	
		}
		
		System.out.println("Total score: " + total);
		average = total / studentScores.length;
		System.out.println("Average: " + average);
		
//		얕은복사
		int[] number5 = {1, 2, 3};
		int[] numberCopy = number5;
		number5[2] = 300;
		System.out.println(numberCopy[2]);
		
//		깊은복사
		int[] numbersDeepCopy = new int[number5.length];
		for(int i = 0; i < number5.length; i++) {
			numbersDeepCopy[i] = number5[i];
		}
		
		for(int i = 0; i < numbersDeepCopy.length; i++) {
			System.out.println(numbersDeepCopy[i]);
		}
		
		int[] myScores = {80, 90, 100};
		myScores = null;
//		System.out.println(myScores[0]);  // 에러
		
		
		int[][] mns = {{1, 2}, {10,20}, {100,300}};
		int[][] mns2 = new int[3][2];
		mns2[0][0] = 1;
		mns2[0][1] = 2;
		mns2[1][0] = 10;
		mns2[1][1] = 20;
		mns2[2][0] = 100;
		mns2[2][1] = 300;
		
		System.out.println(mns2[0]);
		System.out.println(mns2[0][1]);
		mns2[0][1] = 222;
		System.out.println(mns2[0][1]);
		
		int[][] mns3 = new int[][] {{1, 2}, {10, 20}, {100, 300}};
		*/
		
	}

}
