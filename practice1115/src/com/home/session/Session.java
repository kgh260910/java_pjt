package com.home.session;

import java.util.HashMap;

public class Session {
	
	private static Session session;
	
	final private HashMap<String, Object> attributies;
	
	private Session() {
		attributies = new HashMap<String, Object>();
	}
	
	public static Session getInstance() {
		if (session == null) {
			session = new Session();
		}
		return session;
	}

	// getter
	public HashMap<String, Object> getAttributies() {
		return attributies;
	}
	
	public void setAttribute(String name, Object object) {
		attributies.put(name, object);
	}
	
	// 삭제하는 메서드
	public void removeAttribute(String name) {
		attributies.remove(name);
	}
	
	
	
	

}
