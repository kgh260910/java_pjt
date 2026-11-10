package com.office.diary;

import java.util.Scanner;

import com.office.config.Config;
import com.office.menu.Menu;
import com.office.session.Session;

public class DiaryController {
	
	final DiaryService diaryService;

	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	public void execute(Scanner scanner, int selectedMenu) {
		
		String diaryTitle;
		String diaryBody;
		
		switch (selectedMenu) {
		case Menu.DIARY_WRITE:
			
			scanner.nextLine();
			
			System.out.println("Input new diary TITLE!!");
			diaryTitle = scanner.nextLine();
			System.out.println("Input new diary BODY!!");
			diaryBody = scanner.nextLine();
			
			DiaryDto diaryDto = new DiaryDto(diaryTitle, diaryBody);
			
			int resultForWrite = diaryService.writeDiary(
					String.valueOf(Session.getInstance().getAttribute(Config.SIGNED_MEMBER_ID))
					,diaryDto); 
			
			if (resultForWrite == DiaryService.DIARY_WRITE_SUCCESS) {
				System.out.println("DIARY WRITE SUCCESS!!");
			} else {
				System.out.println("DIARY WRITE FAIL!!");
			}
			
			break;
			
		case Menu.DIARY_READ:
			break;
		}
		
	}

}
