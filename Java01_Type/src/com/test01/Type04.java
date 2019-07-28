package com.test01;

public class Type04 {

	
	// 문자형, 문자열, 논리형 : char(2), Stirng(참조형이지만 기본형으로 쓸 수 있다), boolean(1)
	public static void main(String[] args) {
		
		char c01 = 'a';
		System.out.println(c01);
		
		int c02 = c01;			// 형 변환
		System.out.println(c02);	// ASCII 코드 'a' = 97
		
		String s01 = "aa";
		System.out.println(s01);
		String s02 = "bb";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		System.out.println("-----------------------");
		
	
		System.out.println("\uc9c4\uc6b0\ud604");
		char last = '\uc9c4';
		System.out.println(last);
		
		System.out.println("-----------------------");
		
		boolean bl01 = true;		// 참
		boolean bl02 = false;		// 거짓
		System.out.println(bl01);
		System.out.println(bl02);
		
	}
	
	
	
	
}

