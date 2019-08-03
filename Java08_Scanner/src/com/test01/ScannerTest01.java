package com.test01;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test01();
		test02();

	}

	public static void test01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int i = sc.nextInt();
		System.out.println("숫자를 입력해 주세요 : ");
		int j = sc.nextInt();
				
		int sum = i+j;
		System.out.println("두 숫자의 합 : "+sum);
				
		
	}
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("문자를 입력해 주세요.");
		//String s1 = sc.nextLine();
		
		System.out.println("문자를 입력해 주세요.");
		String s = sc.next();	// .next 와 .nextLine을 같이 사용할 때 주의
		String s2 = sc.nextLine();	// 공백 허용 (sc.next(); 는 공백 허용x, 공백 전까지만 출력) -> 얘가 s의 공백 뒤 문자를 담아줌.
		
		System.out.println("입력한 문자는 : "+s);
		System.out.println("추가: "+s2);
		
	}
	
	
}
