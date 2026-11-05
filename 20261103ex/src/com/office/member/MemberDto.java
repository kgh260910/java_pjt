package com.office.member;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	
	public MemberDto() {   // 핸드폰번호가 빠진 객체를 만들거나 메일이 빠진 객체를 만드는 등 
		                   // 다양한 객체를 커버할 수 있는 방법 + getter,setter이용
	}
	
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
}
