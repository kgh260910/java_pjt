package com.home.diary02;

import java.util.ArrayList;

public class DiaryDao {
	
	private ArrayList<String> diaries = new ArrayList<String>();
	
	public ArrayList<String> getDiaries() {
		return diaries;
	}

	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforeSize = diaries.size();
		
		diaries.add(0, diaryDto.getTxt());
		
		int afterSize = diaries.size();
		
		
		return afterSize > beforeSize ? true : false;
	}

}
