package com.point;

import java.util.Scanner;

public class PointLength {

	public static void main(String[] args) {
		// 0.0 부터 x,y 까지의 길이를 구하자.
		// root(x^+y^)
		Scanner sc = new Scanner(System.in);
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		double pLen = pLength(x,y);
		System.out.printf("원점부터 %d, %d 까지의 길이는 %.2f입니다.",x,y,pLen);
				

		
	}
	
	public static double pLength(int x, int y) {
		//java.lang.Math
		/*double pLen = Math.hypot((double)x, (double)y);
		
		return pLen;*/
		double res = Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
		return res;
		
	}
}
