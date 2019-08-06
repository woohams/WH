package com.test06;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("도형을 입력해 주세요.\n"
				+ "[1:원 2:삼각형 3:사각형]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Area ar = null;
		
		switch(select) {
		case 1: ar = new Circle(); break;
		case 2: ar = new Triangle(); break;
		case 3: ar = new Square(); break;
		}
		ar.make();
		ar.print();

	}

}
