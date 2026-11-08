package com.home.test02;

import java.util.ArrayList;
import java.util.HashMap;

public class DiaryDb {
	
	private static DiaryDb diaryDb;
	
	final private HashMap<String, MemberDto> members;
	final private HashMap<String, ArrayList<DiaryDto>> diaries;
	
	
	private DiaryDb() {
		members = new HashMap<String, MemberDto>();
		diaries = new HashMap<String, ArrayList<DiaryDto>>();		
	}
	
	public static DiaryDb getInstance() {
		if (diaryDb == null)
			diaryDb = new DiaryDb();
		return diaryDb;
	}
	

}
