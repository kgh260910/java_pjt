package com.office.home;

import java.util.HashMap;
import java.util.Scanner;

import com.office.Container;
import com.office.menu.Menu;
import com.office.session.Session;

// 프레젠테이션 로직 처리
public class HomeController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			
			Menu.generateMenu();
			
			int selectedMenu = scanner.nextInt();
			switch (selectedMenu) {
			
			// 멤버와 관련된 일 -> 멤버컨트롤러로 보내자!
			case Menu.MEMBER_SIGN_UP:
			case Menu.MEMBER_SIGN_IN:
			case Menu.MEMBER_SIGN_OUT:
			case Menu.MEMBER_MODIFY:
			case Menu.MEMBER_DELETE:
				// 스캐너를 넘겨줘야 작업가능, selectedMenu를 넘겨주어 해당작업을 하도록 만든다.
				Container.getInstance().getMemberController().execute(scanner, selectedMenu);
				break;
				
			// 다이어리와 관련된 일 -> 다이어리컨트롤러로 보내자!
			case Menu.DIARY_WRITE:
			case Menu.DIARY_READ:
				Container.getInstance().getDiaryController().execute(scanner, selectedMenu);
				break;
				
			case Menu.SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Good bye~~");
				break;
			}
			
			
		}
		
		
		scanner.close();
		
	}

}
