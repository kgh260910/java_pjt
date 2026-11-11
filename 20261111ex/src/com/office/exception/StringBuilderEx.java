package com.office.exception;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		String str = "";
		
		long beforeCurrentTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			str += "s";
		}
		
		long afterCurrentTime = System.currentTimeMillis();

		System.out.println("String 경과 시간: " + (afterCurrentTime - beforeCurrentTime));  // ms로 결과가 나옵니다.
		
		System.out.println("-------------------------------------------------");
		
		StringBuilder stringBuilder = new StringBuilder();
		
		beforeCurrentTime = System.currentTimeMillis();
				
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("s");
		}
		
		afterCurrentTime = System.currentTimeMillis();
		
		System.out.println("StringBuilder 경과 시간: " + (afterCurrentTime - beforeCurrentTime));
		
		
	}

}
