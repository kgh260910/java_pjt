package com.office.diary;

public class DiaryService {
	
	// final이어서 딱 1번만 초기화할 기회가 있다.(아래코드는 초기화 안한상태)
	final private DiaryDao diaryDao;
	
	public DiaryService(DiaryDao diaryDao) {
		// 여기서 diaryDao가 초기화되었다.
		this.diaryDao = diaryDao;
	}

}
