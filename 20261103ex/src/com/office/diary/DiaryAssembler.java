package com.office.diary;

//싱글톤 클래스
public class DiaryAssembler {
	
	private static DiaryAssembler diaryAssembler;
	
	// 컨테이너에 부품이 있으며 결합까지 되어있다! (추천되는 방식)
	final private DiaryDao DIARY_DAO = new DiaryDao();
	final private DiaryService DIARY_SERVICE = new DiaryService(DIARY_DAO);
	final private DiaryController DIARY_CONTROLLER = new DiaryController(DIARY_SERVICE);
	
	private DiaryAssembler() {
	
	}
	
	public static DiaryAssembler getInstance() {
		if (diaryAssembler == null) {
			diaryAssembler = new DiaryAssembler();
		}
		
		return diaryAssembler;
		
	}

	public DiaryController getDiaryController() {
		return DIARY_CONTROLLER;
	}

	public DiaryService getDiaryService() {
		return DIARY_SERVICE;
	}

	public DiaryDao getDiaryDao() {
		return DIARY_DAO;
	}	
	
	
	

}
