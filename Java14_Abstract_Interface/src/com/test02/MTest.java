package com.test02;

import java.util.Scanner;

public class MTest {

	/*
	 * 동적 바인딩 - 실행 시(runtime) 메모리 할당을 하면서 메소드를 동적으로 연동
	 * 목적 -	1. 코드 절약
	 * 		2. 실행 속도 향상
	 * 		3. 행위 은닉
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("동물을 선택해 주세요.\n[1:고양이 2:송아지 3:멍멍이]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Animal animal = null;
		
		switch(select) {
		case 1 : animal = new Cat(); break;
		case 2 : animal = new Cow(); break;
		case 3 : animal = new Dog(); break;
		
		}
		animal.start();
		animal.stop();
	}

}
