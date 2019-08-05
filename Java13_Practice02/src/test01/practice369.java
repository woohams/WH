package test01;

import java.util.Scanner;

public class practice369 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~99까지의 정수를 입력하세요");
		int i = sc.nextInt();
		int j = i/10;
		int k = i%10;
		int t = 0;
		if(i>99||i<1) {
			System.out.println("1~99까지의 정수를 입력하셔야 합니다.");
		}
		if(j!=0&&j%3==0) {
			t++;
		}
		if(k!=0&&k%3==0) {
			t++;
		}
		if(t==1) {
			System.out.println("박수 짝");
		}else if(t==2) {
			System.out.println("박수 짝짝");
		}else {
			System.out.println(i);
		}
	}
}

