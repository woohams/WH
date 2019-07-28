package com.test01;

public class Type03 {

	
	// 실수형(소수점) 리터럴 : float(4), double(8)
	public static void main(String[] args) {
		
		float f01 = 0.1f;
		float f02 = 1.89f;
		float sumF = f01 + f02;
		System.out.println(sumF + " = " + f01 + " + " + f02);	// 실수형 값의 기본은 double, float형은 접미사로 f를 붙혀야만 인식함.
		
		System.out.println("-----------------------");
		
		double d01 = 100.04;	// 실수형 기본 형 : double
		double d02 = 200.91D;	// double형이 실수형의 기본형이기 때문에 접미에 D를 붙혀도 되고 안 붙혀도 상관 없다.(대,소문자 구분 X)
		double sumD = d01 + d02;
		System.out.println(sumD);
		
	}
	
	
	
	
	
	
	
	
}







