package com.office.diary;

import java.util.ArrayList;

public class DiaryService {
	
	// final이어서 딱 1번만 초기화할 기회가 있다.(아래코드는 초기화 안한상태)
	final private DiaryDao diaryDao;
	
	public DiaryService(DiaryDao diaryDao) {
		// 여기서 diaryDao가 초기화되었다.
		this.diaryDao = diaryDao;
	}

	public void writeNewDiary(DiaryDto diaryDto) {

		boolean result = diaryDao.insertDiary(diaryDto);
		
		if (result) {
			System.out.println("WRITE DIARY SUCCESS!!");
		} else {
			System.out.println("WRITE DIARY FAIL!!");
		}
		
	}

	public void readDiraries() {
		
		ArrayList<String> diaries = diaryDao.getDiaries();
		for (int i = 0; i < diaries.size(); i++) {
			System.out.println(diaries.get(i));   // 값을 빼올 때
		}
		
	}

}
