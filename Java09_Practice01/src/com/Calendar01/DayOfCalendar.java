package com.Calendar01;

public class DayOfCalendar {
	
	//윤년 계산
	private static boolean isLeapYear(int year) {
		boolean leap = false;
		if(year%4==0&&year%100==0||year%400==0) {
			leap = true;
		}
		
		return leap;
	}
	
	//일수 계산
	private static int dates(int year, int month) {
		int day = 0;
		if(isLeapYear(year)) {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2: 
				day = 29;
				break;
			}
							
		}else {
			switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2: 
			day = 28;
			break;
		}
	}
		
		return day;
}
	
	//해당 년도 해당월의 1일의 요일 계산
	private static int whatDay(int year, int month) {
		
		//총 일수
		int sum = 0;
		
		//요일(sum%7)
		int dayOfweek=0;
		
		
		// 1년 1월 1일 ~ year-1년 12월 31일 까지의 합
		for(int i = 1; i<year;i++) {
			for(int j = 1; j<=12; j++) {
				sum+=dates(i,j);
			}
		}
		
		
		// year 1월 1일 ~ month-1년 1월 마지막일 까지의 합
		for(int i=1; i<month; i++) {
			sum+=dates(year,i);
		}
		
		//year년 month월의 1월의 요일
		sum+=1;
		dayOfweek = sum%7;
		
		return dayOfweek;
	}
	
	//달력 출력
	public static void calPrn(int year, int month) {
		
		// 윗부분
		System.out.println("----------------------["+year+"년 "+month+"월]----------------------");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		//시작 요일
		int start = whatDay(year,month);
		//마지막 날짜
		int last = dates(year,month);
		
		// 해당 년도 해당 월의 1일의 요일만큼 빈공간 (\t)
		for(int i=0; i<start;i++) {
			System.out.print("\t");
		}
		// 전체 출력
		int cnt =1+start;	// 7번 돌면 줄바꿈인데 +start를 안해주면 tab은 횟수로 안쳐주기 때문에 
							// +start를 해서 tab과 i가 for문을 도는걸 7회로 맞춰줘야 한다.

		for(int i=1; i<last+1; i++) {
			System.out.printf("%d\t", i);
			if(cnt%7==0) {
				System.out.println();
			}
			cnt++;
		}

		
	}

}
