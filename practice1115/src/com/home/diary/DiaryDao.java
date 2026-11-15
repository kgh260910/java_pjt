package com.home.diary;

import java.util.ArrayList;
import java.util.Map;

import com.home.db.DiaryDb;

public class DiaryDao {
	
	final private DiaryDb diaryDb;

	public DiaryDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

	public int insertNewDiary(String memId, DiaryDto diaryDto) {
		
		Map<String, ArrayList<DiaryDto>> diaries = diaryDb.getDiaries();
		
		ArrayList<DiaryDto> myDiaries = diaries.get(memId);
		
		if (myDiaries == null) {
			myDiaries = new ArrayList<DiaryDto>();
			diaries.put(memId, myDiaries);
		}
		
		int beforeSize = myDiaries.size();
		
		myDiaries.add(0, diaryDto);
		
		int afterSize = myDiaries.size();
		
		return afterSize - beforeSize >= 1 
				? 
				DiaryService.DIARY_WRITE_SUCCESS
				: 
				DiaryService.DIARY_WRITE_FAIL;
	}

	public ArrayList<DiaryDto> selectDiariesByMemId(String memId) {
		
		Map<String, ArrayList<DiaryDto>> diaries = diaryDb.getDiaries();
		
		return diaries.get(memId);
	}

}
