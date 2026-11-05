package com.office.diary;

import java.util.Scanner;

public class DiaryController implements IDiaryConfig {
	
	final private DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	public void excute() {
	
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.Write    2.Read    99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case DIARY_WRITE:
				break;
				
			case DIARY_READ:
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				break;
			
			}
		}
		
		scanner.close();
		
	}

}
