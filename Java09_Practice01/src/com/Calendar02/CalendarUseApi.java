package com.Calendar02;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarUseApi {

	public void calPrn() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력해 주세요: ");
		int year = sc.nextInt();
		System.out.printf("월을 입력해 주세요: ");
		int month = sc.nextInt();	// Scanner부터 여기까지 다 지우고 calPrn(int year, int month)로 설정한 뒤
									// main에서 (2019, 4) 쓰면 값 나옴. (값 입력하는 방법 다르게 하기)
		
		// Java.util.Calendar 클래스를 이용하여 달력을 출력해보자.
		
		// 가장 첫 부분		
		System.out.printf("======================%d년 %d월======================\n",year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		// 시작 날짜 설정
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);	//month - 0 for January, so month-1
		
		
		// 설정한 1월의 시작 요일 (일요일 : 1 ~ 토요일 : 7)
		int start = cal.get(Calendar.DAY_OF_WEEK);

			
		
		// 해당 요일만큼 빈 공간(\t)
		for(int i=1; i<start; i++) {	// why int i =1? because sunday = 1
			System.out.printf("\t");
			
		}
		
		//전체출력 - getActualMaximum : 해당 값의 최고 월을
		for(int i=1; i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%d\t",i);
			if(start%7==0) {
				System.out.println();
			}
			start++;
		}
		
	}


}
