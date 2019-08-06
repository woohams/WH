package com.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	double width = 0;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		
		System.out.println("반지름을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		width = (Math.PI*x*x);	
		setResult(String.valueOf(width));
		// setResult(width+"");

	}


	public void print() {
		
		System.out.printf("원의 넓이는 %.4f 입니다.", width);

	}
	
	
}
