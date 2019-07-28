package com.test02;

public class TypeToType01 {
	
	public static void main(String[] args) {
		//형 변환
		
		//묵시적 형 변환(upCasting) : 작은 타입 -> 큰 타입은 자동으로 바뀐다.
		//promotion
		byte b01 = 100;
		int i01 = b01;
		System.out.println(i01);
		
		//명시적 형 변환(downCasting) : 큰 타입 -> 작은 타입은 알려줘야 바뀐다.
		//casting
		int i02 = 100;	// 10000을 넣으면 값이 넘어가버려서 다른 값이 출력된다.
		byte b02 = (byte) i02;
		System.out.println(b02);
	}
		
}
