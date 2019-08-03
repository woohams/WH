package com.cal;

import java.util.Scanner;

public class Calendar {
	
	
	public static void main(String[] args) {
		
		// 요일 계산(윤년, 일수, 요일 계산 필요)
		
	}
	
	

	public void inputYear(int year, int month) {

		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요 : ");
		System.out.println("월을 입력하세요 : ");

		
		System.out.println("------["+year+"년 "+month+"월]------");
		System.out.println("  일    월   화    수    목   금    토");

		int cnt = 1;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {			
				System.out.printf("%2d ", cnt++);

			}
			System.out.println();
		}

	}
	public void calc(int year, int month) {
		
		
		
		
	}
	
	// 윤년 계산
	public boolean leafYearCheck(int year) {
        boolean leaf = false;
        if(year%4==0 && year%100!=0 || year%400==0) { 
            leaf = true;
        }
        return leaf;
    }
	
	public int days(int year) { 
        int daySum = 0;
        for(int i=1; i<year; i++) {
            if(leafYearCheck(i)) {
                daySum += 366;
            }else {
                daySum += 365;
            }
        }
        return daySum;
    }
	
}
