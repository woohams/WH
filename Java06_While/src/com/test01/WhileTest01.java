package com.test01;

public class WhileTest01 {

	public static void prn01() {

		int i = 1; // 초기 값

		while (i < 10) { // 조건식 참일 동안 반복, 값이 true면 계속 반복한다.
			System.out.println(i);

			i++; // 증감식

		}

		System.out.println("while이 종료된 후의 i 값: " + i); // 10, 조건문을 빠져나가서 while문에서는 1~9까지 출력
	}

	public static void prn02() {

		int i = 1; // 초기 값

		do {
			System.out.println(i);
			i++; // 증감식

		} while (i < 10); // 조건식
		// (i == 10) 하면 안된다 !! -> 1은 10과 같지 않기때문에 false가 되서 한 번만 실행된다.

		System.out.println("do while이 종료된 후의 i 값 : " + i); // 10, do - while 문은 적어도 한 번 명령을 실행한다.(false여도 실행한다는 뜻, true면
															// 다시 위로 올라가 실행한다)

	}
	//ctrl + shift + f = 자동 들여쓰기
	public static void prn03() {

		int i = 1;

		while (true) {
			System.out.println(i);
			i++;

			if (i == 10) {

			}
			break;	// 생략 시 무한루프

		}

	}

	public static void main(String[] args) {

		prn01();
		prn02();
		prn03();

	}

}
