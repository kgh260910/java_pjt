package com.home;

import com.home.dumy.Dumy;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Container.getInstance().getHomeController().execute();
		
		Container container = Container.getInstance();
		container.getHomeController().execute();
		
		if (Config.IS_DEV) {
			Dumy dumy = new Dumy();
			dumy.setDumy();
		}
		
		
	}
	

}
