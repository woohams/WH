package com.test01;

public class Iftest02 {

	
	public static void main(String[] args) {
		
		// 1. 입력 받은 수가 5의 배수이면 "5의 배수입니다." 출력
		test01(15);
		
		// 2. 입력 받은 수가 2의 배수이면서 3의배수이면 "2와 3의 배수입니다." 출력
		//	   아니라면 "2와 3의 배수가 아닙니다." 출력
		test02(8);
		// 3. 입력 받은 문자가 소문자라면 "소문자 입니다."
		//	  대문자라면 "대문자 입니다. 출력
		//	java.lang.Character 참고
		test03('g');
		
		
	}
	
	public static void test01(int i) {
		
		if(i % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		
	}
	
	public static void test02(int i) {
		
		if(i % 6 == 0) {			
			System.out.println("2와 3의 배수입니다.");			
		}else {			
			System.out.println("2와 3의 배수가 아닙니다.");			
		}
		
	}
	
	public static void test03(char c) {
		
		/*if(c >= 'A' && c <= 'Z' ) {
			System.out.println("대문자 입니다.");
		}else  {
			System.out.println("소문자 입니다");
		}*/
		if(Character.isLowerCase(c)) {
			System.out.println("소문자 입니다.");
		}else if(Character.isUpperCase(c)) {
			System.out.println("대문자 입니다.");
		}
	}
}
