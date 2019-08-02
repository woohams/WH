package com.test02;

public class GuGuDan {

	public static void main(String[] args) {
		// 문제 1. 2단부터 9단까지 출력하라.
		/*
		 * <2단> 2 * 1 = 2 2 * 2 = 4 ... 2 * 9 = 18
		 * 
		 * <3단> ... 9 * 9 = 81
		 * 
		 */
		prn01();
		// 문제 2. main 메소드에서 특정 숫자를 전달하면 전달된 단만을 출력하라.
		prn02(5);
		// 문제 3. while 로 변경
		prn03();
	}

	private static void prn01() {

		for (int i = 2; i < 10; i++) {
			System.out.printf("<%d단>\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}

	}

	private static void prn02(int i) {

		System.out.printf("<%d단>\n", i);
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
		}

	}

	private static void prn03() {

		//초기값
		int i = 2;

		while(i<10) {	//i 조건식
			System.out.printf("<%d단>\n", i);
			
			int j = 1;	//★ int j는 여기서 초기화 시켜줘야 인식한다.
			while(j<10) {	//j 조건식
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;	//j 증감식
				
			
			}
			
			//i 증감식
			i++;
		}
	}
		
}