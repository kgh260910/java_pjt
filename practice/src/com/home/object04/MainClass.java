package com.home.object04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Daeri daeri = new Daeri();
		Gwajang gwajang = new Gwajang();
	
		PayService payService = new PayService(daeri, gwajang);
		
		PayController payController = new PayController(payService);
		
		payController.execute();
		
	}

}
