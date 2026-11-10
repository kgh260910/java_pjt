package com.office;

import com.office.config.Config;
import com.office.dumy.Dumy;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 부품 생성(assemble)
		Container container = Container.getInstance();
		
		// set dumy
		if (Config.IS_DEV) {
			new Dumy().setDumy();
//			Dumy dumy = new Dumy();
//			dumy.setDumy();
		}
		
		
		//컨테이너에서 홈컨트롤러객체를 가져오고, 홈컨트롤러메서드인 execute사용
		Container.getInstance().getHomeController().execute();
		// 더미데이터 생성은 위 코드 전에 하는 것이 바람직하다.
		
		
		
		
	}

}
