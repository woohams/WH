package com.test06;

import java.util.Scanner;

public class Square extends AreaImpl {
	int width = 0;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("변의 길이를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("다른 변의 길이를 입력해 주세요 : ");
		int y = sc.nextInt();
		
		width = x*y;

	}
		public void print() {
		
		System.out.printf("사각형의 넓이는 %d입니다.", width);

	}
	

}
