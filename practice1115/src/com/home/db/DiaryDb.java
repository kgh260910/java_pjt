package com.home.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.home.diary.DiaryDto;
import com.home.member.MemberDto;

public class DiaryDb {
	
	private static DiaryDb diaryDb;
	
	final private Map<String, MemberDto> members;
	final private Map<String, ArrayList<DiaryDto>> diaries;
	
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

	public Map<String, MemberDto> getMembers() {
		return members;
	}

	public Map<String, ArrayList<DiaryDto>> getDiaries() {
		return diaries;
	}
}
