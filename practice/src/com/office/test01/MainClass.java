package com.office.test01;

public class MainClass {
	
	public static void main(String[] args) {
		
		MemberContainer.getInstance()
						.getMemberController()
						.execute();
		
		
	}

}
