package com.home;

import com.home.db.DiaryDb;
import com.home.diary.DiaryController;
import com.home.diary.DiaryDao;
import com.home.diary.DiaryService;
import com.home.home.HomeController;
import com.home.member.MemberController;
import com.home.member.MemberDao;
import com.home.member.MemberService;

public class Container {
	
	private static Container container;
	
	final private HomeController homeController;
	
	final private MemberController memberController;
	final private MemberService memberService;
	final private MemberDao memberDao;
	
	final private DiaryController diaryController;
	final private DiaryService diaryService;
	final private DiaryDao diaryDao;
	
	private Container() {
		
		homeController = new HomeController();
		
		memberDao = new MemberDao(DiaryDb.getInstance());
		memberService = new MemberService(memberDao);
		memberController = new MemberController(memberService);
		
		diaryDao = new DiaryDao(DiaryDb.getInstance());
		diaryService = new DiaryService(diaryDao);
		diaryController = new DiaryController(diaryService);
		
	}
	
	
	public static Container getInstance() {
		if (container == null) {
			container = new Container();
		}
		return container;
	}
	

}
