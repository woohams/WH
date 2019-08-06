package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {
	double width = 0;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("밑변을 입력해 주세요:  ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("높이를 입력해 주세요 : ");
		int y = sc.nextInt();
		
		width = x*y/2;
		setResult(String.valueOf(width));

	}
	public void print() {
		
		System.out.printf(print+width+"입니다.");	// print : Area.print
		//super.print();

	}
	

}
