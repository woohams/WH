package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	
	public static void main(String[] args) {
		int[] original = {10,20,30};
		int[] copy = original;		// reference가 복사(주소) -> 주소 값 복사
		
		copy[1] = 200;
		System.out.println(Arrays.toString(original));	//[10, 200, 30], call by reference기 때문에 얕은 카피
		
		System.out.println(original == copy); 	// true
		
		//hashoCode() : 객체의 주소 값
		System.out.println((original.hashCode()));
		System.out.println((copy.hashCode()));
		System.out.println();
		System.out.println(original);	//16진수
	}
	

}
