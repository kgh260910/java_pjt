package com.home.diary01;

import java.util.ArrayList;

public class DiaryDao {
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforeSize = diaries.size();
		
		diaries.add(0, diaryDto.getTxt());
		
		int afterSize = diaries.size();
		
		return afterSize > beforeSize ? true : false;
	}

	public ArrayList<String> getDiaries() {
		return diaries;
	}

}
