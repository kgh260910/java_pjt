package com.office.exception;

public class StringEx {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		System.out.println(stringBuffer);
		
		/*
		 * 문자열 추가
		 */
		stringBuffer.append(" world");   
		System.out.println(stringBuffer);  // Hello world
		
		/*
		 * 특정 위치에 문자열 추가
		 */
		stringBuffer.insert(5, "++");
		System.out.println(stringBuffer);  // Hello++ world
		
		/*
		 * 특정 범위 삭제
		 */
		stringBuffer.delete(5, 10);       // 인덱스5번째부터 9번째까지 삭제합니다.
		System.out.println(stringBuffer);  // Hellorld
		
		/*
		 * 특정 문자 삭제
		 */
		stringBuffer.deleteCharAt(5);	   // 인덱스5의 문자를 삭제합니다.
		System.out.println(stringBuffer);  // Hellold
		
		/*
		 * 문자열 교체
		 */
		stringBuffer.replace(2, 4, "LL");	// 인덱스2~4(4는미포함)의 문자를 "LL"로 바꾸겠다.
		System.out.println(stringBuffer);   // HeLLold
		
		/*
		 * 문자열 뒤집기
		 */
		stringBuffer.reverse();			 	// 뒤집기
		System.out.println(stringBuffer);  // dloLLeH
		
		/*
		 * 문자열 길이
		 */
		int length = stringBuffer.length();   
		System.out.println("length: " + length);           // 7
		
		
	}

}
