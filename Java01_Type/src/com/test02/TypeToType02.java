package com.test02;

public class TypeToType02 {
	
	public static void main(String[] args) {
		
		int i = 65;
		char c = (char) i;	// 명시적 형변환
		System.out.println("int to char: " +c);
		
		char c02 = 'A';
		int i02 = c02;	// 묵시적 형변환
		System.out.println("char to int : " +i02);
		
		int i03 = 65;
		String s01 = String.valueOf(i03);
		System.out.println(s01+1);
		
		int i04 = Integer.parseInt(s01)+1;	// 문자 -> 숫자
		System.out.println(i04);
	}

}
