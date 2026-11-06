package com.office.test01;

import java.util.ArrayList;

public class DiaryService {
	
	final private DiaryDao diaryDao;
	
	public DiaryService(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}
	
	public void writeNewDiary(DiaryDto diaryDto) {
		
		boolean result = diaryDao.insertDiary(diaryDto);
		
		if (result) {
			System.out.println("다이어리 작성 성공!!");
		} else {
			System.out.println("다이어리 작성 실패!!");
		}
		
	}
	
	public void readDiaries() {
		
		ArrayList<String> diaries = diaryDao.getDiaries();
		for (int i = 0; i < diaries.size(); i++) {
			System.out.println(diaries.get(i));
		}
		
	}
	

}
