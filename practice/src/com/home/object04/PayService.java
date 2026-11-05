package com.home.object04;

import java.util.List;

/*
 * 월급 지급 업무 처리
 */

public class PayService {
	
	/*
	private List <Employee> employees;
	public PayService(List<Employee> employess) {
		this.employees = employess;
	}
	*/
	
	
	private Daeri daeri;
	private Gwajang gwajang;
	
	public PayService(Daeri daeri, Gwajang gwajang) {
		this.daeri = daeri;
		this.gwajang = gwajang;
	}
	
	public void pay(int month) {
		/*
		 * for (Employee emp : employees) {
		 
			emp.pay();
		}
		*/
		this.daeri.pay();
		this.gwajang.pay();
		
		System.out.println(month + "월 급여 지급 완료!!");
	}
	
	

}
