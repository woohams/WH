package com.test02;

public class TypeToType03 {
	
	public static void main(String[] args) {
		
		//boxing
		Integer i = new Integer(100);
		// 참조 타입은 type 변수 = new type(); 형태로 만든다.
		System.out.println(i);
		
		//unBoxing
		// 명시적 unBoxing
		int j = i.intValue();
		System.out.println(j);
		// 묵시적 unBoxing
		int k = i;
		System.out.println(k);
	}

}
