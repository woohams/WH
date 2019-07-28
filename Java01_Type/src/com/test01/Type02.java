package com.test01;

public class Type02 {

	// 정수형 리터럴(값) : byte(1), short(2), int(4), long(8)
	public static void main(String[] args) {
		
		// Type 변수명 = 값;
		
		byte b01 = 126;
		System.out.println(b01);
		byte b02 = (byte)128;	// byte = 8bit, -128 ~ 127(0 포합) : 256개 표현 가능, 따라서 128을 담지 못함.
								// 정수의 기본 타입 : int
		System.out.println(b02);
		
		byte sumB = (byte) (b01 + b02);	// 정수 연산의 기본 타입 : int
		// casting (형 변환)
		System.out.println(sumB);
		
		System.out.println("-----------------------");
		
		short s01 = 32767;
		s01 = 1;	// 변수 안의 값 변환
		System.out.println(s01);
		short s02 = 12345;
		System.out.println(s02);
		short sumS = (short) (s01 + s02);
		System.out.println(sumS);
		
		System.out.println("-----------------------");
		
		int i = 10; int j = 20; int sum = i+j;
		System.out.println(sum);
		i = 50; 
		System.out.println(sum);
		
		System.out.println("-----------------------");
		long l01 = 3000000000l;
		long l02 = 4000000000L;	// 소문자 대문자 l, L 상관 X
		long sumL = l01 + l02;
		System.out.println(sumL);
		
		
		// 2 진수 : 0b
		System.out.println(0b10);
		// 8 진수 : 00
		System.out.println(0010);
		// 16 진수 : 0x
		System.out.println(0x10);
		
		
		
	}
	
}



