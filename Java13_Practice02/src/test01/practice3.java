package test01;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 변의 길이를 입력하시오 >>");
		int a = sc.nextInt();
		System.out.println("두 번째 변의 길이를 입력하시오 >>");
		int b = sc.nextInt();
		System.out.println("세 번째 변의 길이를 입력하시오 >>");
		int c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("삼각형 가능 !!");
		} else {
			System.out.println("삼각형 불가능..");
		}
		if (a + b > c && a + c > b && b + c > a) {
			if (a + b == c || a + c == c || b + c == c) {
				System.out.println("직각 삼각형 !!");
			} else if (a + b < c || a + c < b || b + c < c) {
				System.out.println("둔각 삼각형 !!");
			} else if (a + b > c || a + c > b || b + c > a) {
				System.out.println("예각 삼각형 !!");
			} 
		}
	}

}
