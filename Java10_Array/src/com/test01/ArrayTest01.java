package com.test01;

import java.util.Arrays;

public class ArrayTest01 {
	// 배열(Array) : 여러개의 '같은 타입의' 값을 효과적으로 관리하기 위한 객체
	// 배열을 선언할 때 크기가 고정!
	// 배열은 찹조타입(mutable) : 주소값으로 변경, new를 사용하지 않아도 객체 생성 가능!
	
	public static void main(String[] args) {
		
		// 방법 1 
		int [] a;	// 선언(타입 변수;)
		a = new int[5];	// 정의
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;	// 초기화
		
		// 방법 2
		int[] b = new int[] {5,4,3,2,1};	// 선언 정의 초기화를 한번에 !
		
		// 방법 3
		int c[] = {6,7,8,9,10};				//선언 초기화, []는 타입 뒤나 변수앞이나 상관x
		
		System.out.println(a[0]);
		System.out.println(a[0]+b[1]);
		
		System.out.println(c);	// c의 주소값이 출력된다.
		System.out.println(Arrays.toString(c));	// c의 배열 값이 출력된다.
		
		prn(c);
		
		String[] s = new String[] {"hava", "a", "nice", "day"};
		modi(s);
		
	}
	
	// {6 7 8 9 10}
	// 배열 전체 출력
	public static void prn(int[] arr) {
		
		System.out.print("{ ");
		for(int i = 0; i <arr.length; i++) {
			 System.out.printf("%d ", arr[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	
	//nice를 good으로 바꿔서 배열 전체 출력
	public static void modi(String[] arr) {
		arr[2] = "good";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	

}
