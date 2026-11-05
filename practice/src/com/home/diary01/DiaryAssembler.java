package com.home.diary01;


//  싱글톤 클래스
public class DiaryAssembler {
	
	private static DiaryAssembler diaryAssembler;
	
	final private DiaryDao diaryDao = new DiaryDao();
	final private DiaryService diaryService = new DiaryService(diaryDao);
	final private DiaryController diaryController = new DiaryController(diaryService);
	
	private DiaryAssembler() {
		
	}
	
	public static DiaryAssembler getInstance() {
		if (diaryAssembler == null) {
			diaryAssembler = new DiaryAssembler();
		}
		return diaryAssembler;
	}

	public DiaryDao getDiaryDao() {
		return diaryDao;
	}

	public DiaryService getDiaryService() {
		return diaryService;
	}

	public DiaryController getDiaryController() {
		return diaryController;
	}
	
	
	

}
