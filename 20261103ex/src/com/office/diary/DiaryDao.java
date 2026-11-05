package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {

	// [] -> 길이 수정 불가 ===> ArrayList
	
	private ArrayList<String> diaries = new ArrayList<String>();  // []
	
	
	
	
	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforeSize = diaries.size();
		
//		diaries.add(diaryDto.getTxt());     // 마지막 인덱스 자리에 추가하기 
		diaries.add(0, diaryDto.getTxt());  // 0번 인덱스자리에 추가하기

		int afterSize = diaries.size();
		
		return afterSize > beforeSize ? true : false;
	}




	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	
	

}
