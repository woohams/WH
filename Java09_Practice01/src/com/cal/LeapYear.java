package com.cal;
//① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, (year % 4 ==0)
//② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 	(year % 100 !=0)
//③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다. 	(year % 400 ==0)

import java.util.Scanner;

public class LeapYear {
	
	/*public void inputYear() {
		System.out.println("년도를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 400 == 0) {
			System.out.println(year+"년은 윤년입니다.");
		}else if(year % 100 ==0) {
			System.out.println(year+"년은 평년입니다.");
		}else if(year % 4 ==0) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		
	}*/
	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		
		if((year%4 ==0)&&(year%100 !=0)||(year%400==0)) {
			isLeap = true;
			
		}
		
		return isLeap;
	}
	public static void main(String[] args) {
		int year=2019;
		
		if(isLeapYear(year)) {
			System.out.printf("%d 년은 윤년이 맞습니다.", year);
		}else {
			System.out.printf("%d 년은 윤년이 아닙니다.", year);
		}
		
	}
	

}


