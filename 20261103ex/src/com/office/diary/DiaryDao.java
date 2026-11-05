package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {

	// [] -> 길이 수정 불가 ===> ArrayList
	
	private ArrayList<String> diaries = new ArrayList<String>();  // []
	
	
	
	
	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforeSize = diaries.size();
		
		diaries.add(diaryDto.getTxt());

		int afterSize = diaries.size();
		
		return afterSize > beforeSize ? true : false;
	}




	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	
	

}
