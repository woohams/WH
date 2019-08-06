package com.test03;

// 인터페이스 : 모든 메소드가 추상 메소드
public interface Animal {
	
	// 변수는 자동으로 상수화
	int i = 10;
	
	// private, protected 사용 불가
	public void bark();
	void eat(String feed);

}
