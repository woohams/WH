package com.test02;

public class MyCalc {

	// 접근제한자 메모리영역 리턴타입 메소드이름(파라미터 or 아규먼트)
	
	// 메소드 외부에서 전달된 값을 메소드 내부에서 사용하기 위해 선언해 놓은 "변수"  = 파라미터(parameter)
	public static void sum(int i, int j) {	// void : return 값 x
		int res = i + j;
		System.out.println(res);	
	}
	
	public static int sub(int i, int j) {	// return 타입은 명령 종료 후 리턴되는 값의 타입, 여기서는 int형이 return되므로 int
		int res = i - j;
		
		return res;
	}
	
	public static double mul(int i, double j) {
		double res = i * j;
		
		return res;
	}
	
	public static void div(int i, int j) {
		int result = i / j;		
		// '/' : 나눈 후의 몫
		int divResult = i % j;
		// '%' : 나눈 후의 나머지
		System.out.printf("%d / %d 의 몫 : %d \n", i, j, result);
		System.out.printf("%d / %d 의 나머지 :  %d\n",i, j, divResult);
	}
	
	public static void multi(double i, double j) {
		int res2 = (int) (i * j);
		System.out.printf("%.2f / %.2f 의 곱 : %d \n", i, j, res2);
	}
	
	
}
