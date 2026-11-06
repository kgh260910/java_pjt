package com.office.test01;

public interface IMemberService {
	
	public void signUp(MemberDto memberDto);

	public void signIn(MemberDto memberDto);
	
	public void signOut(MemberDto memberDto);
	
	public void modify(MemberDto memberDto);
	
	public void delete(MemberDto memberDto);
}
