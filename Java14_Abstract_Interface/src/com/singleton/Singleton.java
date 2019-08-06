package com.singleton;

// 메모리( heap 영역)에 객체를 한번만 생성
public class Singleton {
	
	// 2. 객체를 확인 할 주소(reference)를 선언 - ※  class 변수로 
	private static Singleton singleTon;	
	
	// 1. 생성자를 private으로 -> 외부에서 생성 불가
	private Singleton() {
		System.out.println("singleton instance 생성!");
	}
	
	// 3. 내 객체가 heap에 있는지 확인
	// 만일 없으면 새로운 객체 생성
	// 있으면 이미 만들어진 객체 리턴
	
	public static Singleton getInstance() {	// non-static 불가능
		if(singleTon == null) {
			System.out.println("new!!");
			singleTon = new Singleton();
		}else {
			System.out.println("exist!!");
		}
		return singleTon;
	}

}
