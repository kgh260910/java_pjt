package com.home.member;

import com.home.db.DiaryDb;

public class MemberDao {
	
	final private DiaryDb diaryDb;

	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

}
