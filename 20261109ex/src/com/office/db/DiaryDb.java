package com.office.db;

import java.util.ArrayList;
import java.util.HashMap;

import com.office.diary.DiaryDto;
import com.office.member.MemberDto;


// 싱글톤
public class DiaryDb {
	
	private static DiaryDb diaryDb;
	
	// final private를 적음으로써 캡슐화(보안강화)
	final private HashMap<String, MemberDto> members;             // 멤버db
	final private HashMap<String, ArrayList<DiaryDto>> diaries;  // 다이어리db
	
	private DiaryDb() {
		members = new HashMap<String, MemberDto>();
		diaries = new HashMap<String, ArrayList<DiaryDto>>();
	}
	
	public static DiaryDb getInstance() {
		if (diaryDb == null) {
			diaryDb = new DiaryDb();
		}
		return diaryDb;
	}
	
	/*
	 * Getters : 조회만 가능하다.
	 */
	public HashMap<String, MemberDto> getMembers() {
		return members;
	}

	public HashMap<String, ArrayList<DiaryDto>> getDiaries() {
		return diaries;
	}
	
	

}
