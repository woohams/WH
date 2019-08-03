package com.random;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		//test01();
		test02();
	}

	public static void test01() {
		//java.util.Random();
		Random rd = new Random();
		System.out.println(rd.nextInt(100));	// 0부터 99까지 숫자 랜덤으로 출력
		
	}
	
	public static void test02() {
		//java.util.Math
		
		//double d = Math.random();	//0 ~1까지 표현
		//System.out.println(d);
		
		//(int)(Math.random()*(max-min+1))+min;	//max-min+1 = 표현하려는 수 갯수
		// +1 한 이유는 max도 랜덤값에 포합하기 위해!
		
		int min = 10;
		int max = 100;
		int ran = (int)(Math.random()*(max-min+1))+min;
		System.out.println(ran);
		
		
	}
}
