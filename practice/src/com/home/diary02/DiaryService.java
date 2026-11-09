package com.home.diary02;

public class DiaryService {
	
	final private DiaryDao diaryDao;
	

	public DiaryService(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}


	public void writeNewDiary(DiaryDto diaryDto) {
		
		boolean result = diaryDao.insertDiary(diaryDto);
		
		if(result) {
			System.out.println("다이어리 등록 성공");
		} else {
			System.out.println("다이어리 등록 실패");
		}
		
	}

}
