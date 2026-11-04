package com.office.member;

import java.util.Scanner;

public interface IMemberService {
	
	public void signUp(MemberDto memberDto);
	
	public void signIn();
	
	public void modify();
	
	public void delete();

}
