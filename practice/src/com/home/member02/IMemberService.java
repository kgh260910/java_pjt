package com.home.member02;

public interface IMemberService {
	
	public void signUp(MemberDto memberDto);
	
	public void signIn(MemberDto memberDto);
	
	public void modify(MemberDto memberDto);
	
	public void delete(MemberDto memberDto);

}
