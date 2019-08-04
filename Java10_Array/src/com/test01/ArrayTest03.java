package com.test01;

import java.util.Arrays;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		// 1. 반복문을 사용하여 a~z를 값으로 가지는 일차원 배열 생성
		char[] ch = new char[26];
		
		for(int i = 0; i <26; i++) {
			ch[i] = (char)((int)'a'+i);				
			}

		
		
		// 2. 1에서 만든 배열을 출력하자
		prn(ch);
		System.out.println();
		
		// 3. 거꾸로 출력하자(z~a)
		prn1(ch);
		System.out.println();
		// 4. 대문자로 바꿔서 출력하자
		prn2(ch);
		System.out.println();
		prn3(ch);
		System.out.println();
	}
	
	// 2. 1에서 만든 배열을 출력하자
			/*
			 * a b c d e f
			 * g h i j k l
			 * m n o p q r
			 * s t u v w x
			 * y z
			 */	
	public static void prn(char[] arr) {
		for(int i = 1; i<=arr.length; i++) {
			System.out.print(arr[i-1]+" ");
			if(i%6==0) {
				System.out.println();
			}
		}
	}

	
	public static void prn1(char[] arr) {
		/*for(int j =26; j<=arr.length; j--) {
			System.out.print(arr[j-1]+" ");
			if(j%6==3) {	// z= 122, u=117 %3마다 줄바꿈
				System.out.println();
			}
			
		}*/
		int temp = 1;
		for(int i = arr.length; i>0; i--) {
			System.out.print(arr[i-1]+" ");
			if(i % 6==3) {
				System.out.println();
			}
		}
		temp++;
		
	}
	public static void prn2(char[] arr) {
		int tmp =1;
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(Character.toUpperCase(arr[i])+" ");
			if(i%6==5) {
				System.out.println();
			}
		}
		tmp++;
	} 
	public static void prn3(char[] arr) {
		int tmp = 1;
		for(int i = 0; i< arr.length; i++) {
			System.out.print(((char)(int)arr[i]-32)+" ");
			if(i%6==5) {
				System.out.println();
			}
			tmp++;
		}
	}

}


