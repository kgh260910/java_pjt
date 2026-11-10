package com.office.session;

import java.util.HashMap;

// 싱글톤
public class Session {
	
	private static Session session;
	
	// 어레이리스트는 배열이라 조회시 사용이 불편하여 해쉬맵으로 생성하였다.
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

	// attributies 객체를 가져오는 메서드 (getter) -> 해쉬맵이 불필요하여 수정
	public Object getAttribute(String name) {
		return attributies.get(name);
	}
	
	
	// attributies에 값을 추가하는 메서드 (setter가 아니다!!!)
	public void setAttribute(String name, Object object) {
		attributies.put(name, object);
	}
	
	// attributies에 키값을 넣어 키-밸류 값을 삭제하는 메서드
	public void removeAttribute(String name) {
		attributies.remove(name);
	}
	
	
}
