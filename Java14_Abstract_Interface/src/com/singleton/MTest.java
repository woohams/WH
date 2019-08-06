package com.singleton;

public class MTest {

	public static void main(String[] args) {
		
		//Singleton st = new Singleton(); -> private라서 사용 불가
		Singleton st = Singleton.getInstance();	// 이렇게 사용
		System.out.println(st);
		
		Singleton st02 = Singleton.getInstance();
		System.out.println(st02);	// 주소 값이 같다.
		
		System.out.println(st == st02);
		System.out.println(st.hashCode());
		System.out.println(st02.hashCode());	// st와 st02는 주소(hashCode)가 같기 때문에 같은 객체라는것을 알 수 있다. 
	}											// 사실 이미 있는 객체이기 때문에 주소값을 리턴해주는 것이다. 
												// 싱글톤은 하나의 객체만을 만들 수 있다.
}
