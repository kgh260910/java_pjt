package com.office.member;

import com.office.db.DiaryDb;

public class MemberDao {
	
	final private DiaryDb diaryDb;
	
	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

}
