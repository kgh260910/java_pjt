package com.home.diary02;

import java.util.Scanner;

public class DiaryController {
	
	final private DiaryService diaryService;

	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		
		while (systemFlag) {
			System.out.println("1.Write 2.Read 99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case 1:
				
				scanner.nextLine();
				
				System.out.println("Input new Diary txt!!");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.writeNewDiary(diaryDto);
				
				break;
				
			case 2:
				break;
				
			case 99:
				systemFlag = false;
				break;
				
			}
		}
		
	}

}
