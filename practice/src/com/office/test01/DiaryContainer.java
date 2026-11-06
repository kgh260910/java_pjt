package com.office.test01;

public class DiaryContainer {
	
	private static DiaryContainer diaryContainer;
	
	final private DiaryDao diaryDao = new DiaryDao();
	final private DiaryService diaryService = new DiaryService(diaryDao);
//	final private DiaryController diaryController = new DiaryController(diaryService);

	private DiaryContainer() {}
	
	public static DiaryContainer getInstance() {
		if (diaryContainer == null) {
			diaryContainer = new DiaryContainer();
		}
		return diaryContainer;
	}

	public DiaryDao getDiaryDao() {
		return diaryDao;
	}

	public DiaryService getDiaryService() {
		return diaryService;
	}

//	public DiaryController getDiaryController() {
//		return diaryController;
//	}
	
	
	
}
