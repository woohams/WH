package com.test01;

public class WhileTest02 {

	public static void main(String[] args) {

		prn01();
		prn02();
		prn03();
	}

	// 1. 1~100까지의 숫자를 거꾸로 출력하자.
	private static void prn01() {
		int i = 100;

		do {
			System.out.println(i);
			i--;

		} while (i > 0);

		System.out.println("================");
	}

	// 2. 1~100까지의 숫자중 2의 배수만 출력하자.
	private static void prn02() {
		int i = 1;

		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i < 101);
		System.out.println("================");
	}

	// 3. 1~100까지의 숫자중 7의 배수의 갯수와 총합을 출력하자.
	private static void prn03() {
		int i = 1;
		int count = 0;
		int sum = 0;

		while (i < 101) {
			if (i % 7 == 0) {
				count++; 
				sum += i; 
			}
			i++;
		}

		System.out.println("7의 배수의 갯수 : " + count + "\n7의 배수의 총합 : " + sum);
	}
}
