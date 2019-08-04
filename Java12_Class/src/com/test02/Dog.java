package com.test02;

public class Dog extends Animal {
	public Dog() {
		System.out.println("멍멍이");
	}
	
	@Override
	public void bark() {
		super.bark();				// bark를 호출하고(부모가 가진)
		System.out.println("멍멍");	// 재정의 한다. main에서 출력하면 울음소리 : 멍멍 이 출력된다.
	}								// 부모것을 부분적으로 상속 받아서 사용할 수도 있다.

}
