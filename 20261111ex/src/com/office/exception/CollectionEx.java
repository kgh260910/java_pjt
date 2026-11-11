package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList: 배열을 업그레이드
		 */
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(3);
		
		nums.add(2, 100);
		
		nums.clear(); // [] 객체는 살리고 데이터는 전부 삭제한다.
		
		// String -> StringBuffer -> StringBuilder
		// Array  -> Vector       -> ArrayList
		
		Vector<Integer> nums2 = new Vector<Integer>();
		
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(50);
		
		nums2.remove(4);
		nums2.remove(3);
		
		nums2.add(2, 100);
		
		nums2.clear();
		
		// 인터페이스로 타입을 정하는 것이 유연성이 좋다
		List<Integer> nums3 = new ArrayList<Integer>(); 	
		Map<String, String> hashMap = new HashMap<String, String>();
	}

}
