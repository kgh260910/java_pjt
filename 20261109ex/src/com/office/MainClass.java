package com.office;

public class MainClass {
	
	public static void main(String[] args) {
		
		//컨테이너에서 홈컨트롤러객체를 가져오고, 홈컨트롤러메서드인 execute사용
		Container.getInstance().getHomeController().execute();
		
		
	}

}
