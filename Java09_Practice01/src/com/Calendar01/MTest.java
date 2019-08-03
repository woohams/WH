package com.Calendar01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해 주세요: ");		
		int year = sc.nextInt();
		System.out.println("월을 입력해 주세요: ");
		int month = sc.nextInt();
		
		DayOfCalendar.calPrn(year, month);
	}

}
