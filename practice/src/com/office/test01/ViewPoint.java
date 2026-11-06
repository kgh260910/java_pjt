package com.office.test01;

public class ViewPoint implements MemberConfig {
	
	private static ViewPoint viewpoint = new ViewPoint();
	private static int viewpositon;
	
	private boolean signUpView = true;
	private boolean signInView = true;
	private boolean signOutView = true;
	private boolean modifyView = true;
	private boolean deleteView = true;
	private boolean systemOutView = true;
	private boolean diaryWriteView = true;
	private boolean diaryListView = true;
	
	
	private ViewPoint() {}
	
	public static ViewPoint getInstance() {
		if (viewpoint == null) {
			viewpoint = new ViewPoint();
		}
		return viewpoint;
	}

	public void getView(int viewposition) {
		
		switch (viewpositon) {
		
		//시작
		case START:
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			signUpView = true;
			signInView = true;
			signOutView = false;
			modifyView = false;
			deleteView = false;
			systemOutView = true;
			diaryWriteView = false;
			diaryListView = false;
			break;
			
			//회원가입후
		case SIGN_UP:
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			signUpView = true;
			signInView = true;
			signOutView = false;
			modifyView = false;
			deleteView = false;
			systemOutView = true;
			diaryWriteView = false;
			diaryListView = false;
			break;
			
			//로그인후
		case SIGN_IN:
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-LIST 99.SYSTEM-OUT");
			signUpView = false;
			signInView = false;
			signOutView = true;
			modifyView = true;
			deleteView = true;
			systemOutView = true;
			diaryWriteView = true;
			diaryListView = true;
			break;
			
			//로그아웃후
		case SIGN_OUT:
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			signUpView = true;
			signInView = true;
			signOutView = false;
			modifyView = false;
			deleteView = false;
			systemOutView = true;
			diaryWriteView = false;
			diaryListView = false;
			break;
			
			//수정후
		case MODIFY:
			System.out.println("3.SIGN-OUT 4.MODIFY 5.DELETE 6.DIARY-WRITE 7.DIARY-LIST 99.SYSTEM-OUT");
			signUpView = false;
			signInView = false;
			signOutView = true;
			modifyView = true;
			deleteView = true;
			systemOutView = true;
			diaryWriteView = true;
			diaryListView = true;
			break;
			
			//삭제후->로그아웃되어야한다.
		case DELETE:
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			signUpView = true;
			signInView = true;
			signOutView = false;
			modifyView = false;
			deleteView = false;
			systemOutView = true;
			diaryWriteView = false;
			diaryListView = false;
			break;
			
			//시스템종료후->최초화면으로
		case SYSTEM_OUT:
			System.out.println("1.SIGN-UP 2.SIGN-IN 99.SYSTEM-OUT");
			signUpView = true;
			signInView = true;
			signOutView = false;
			modifyView = false;
			deleteView = false;
			systemOutView = true;
			diaryWriteView = false;
			diaryListView = false;
			break;
		
		}
		
	}

}
