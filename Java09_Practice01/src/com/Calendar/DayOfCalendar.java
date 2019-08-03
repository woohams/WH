package com.Calendar;

import java.util.Scanner;

// 요일 계산 : 00년 00월 00일은 0요일 입니다.
public class DayOfCalendar {

	// 윤년 계산
	public static boolean isLeapYear(int year) {
		//윤년이면 true, 평년이면 false
		boolean leaf = false;
        if(year%4==0 && year%100!=0 || year%400==0) { 	// 윤년 = true, 평년 = false
            leaf = true;
        }
		
		return leaf;
	}
	// 일수 계산
	public static int dates(int year, int month) {
		//해당 년도가 윤년일 때 1,3,5,7,8,10,12 -> 31일
		//4,6,9,11 -> 30일
		//2 -> 29일
		int day = 0;
		
		if(isLeapYear(year)) {		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day =31;
			break;
		
		case 4: case 6: case 9: case 11: 
			day = 30;
			break;
		case 2: 
			day = 29;
			break;
			}
		}
				
		//해당 년도가 윤년이 아닐 때 1,3,5,7,8,10,12 -> 31
		//4,6,9,11 -> 30일
		// 2 -> 28일
		else {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				day = 31;
			} else if(month==4||month==6||month==9||month==11) {
				day = 30;
			}else if(month==2) {
				day = 28;
			}			
		}			
		return day;		
	}
	
	// 요일 -> 7로 나눈 값을 아규먼트로 넣어준다.
	public static String dayMode(int day) {
		// 0이면 일요일, 1이면 월요일, 2면 화요일... 6이면 토요일
		/*String dayMode = "";
		if(day%7==0) {
			String dayMode = "일요일";		
		}else if(day%7==1) {
			String dayMode = "월요일";
		}else if(day%7==2) {
			String dayMode = "화요일";
		}else if(day%7==3) {
			String dayMode = "수요일";
		}else if(day%7==4) {
			String dayMode = "목요일";
		}else if(day%7==5) {
			String dayMode = "금요일";
		}else if(day%7==6) {
			String dayMode = "토요일";
		}
		return dayMode = "";*/
		String res = "";
		switch(day) {
		case 0:
			res = "일요일";
			break;
		case 1:
			res = "월요일";
			break;
		case 2:
			res = "화요일";
			break;
		case 3:
			res = "수요일";
			break;
		case 4:
			res = "목요일";
			break;
		case 5:
			res = "금요일";
			break;
		case 6:
			res = "토요일";
			break;
		}	
		return res;
	}
	
	

	public static void main(String[] args) {
		
		
		
		/*
		// 1년 1월 1일부터 해당 날짜(2019년 4월 15일) 까지의 총합
		int sum = 0;
		
		int year = 2019;
		int month = 4;
		int day = 15;
		
		// 1) year-1년의 12월 까지의 합 = [1년 1월 1일부터 year-1년 12월 31까지의 합]
		for(int i = 1; i<year;i++) {
			for(int j = 1; j<=12; j++) {
				sum+=dates(i,j);
			}
		}
		
		// 2) month-1월의 마지막 일까지의 합 = [year년 1월 1일부터 month-1 월의 마지막 일까지의 합]
		for(int i=1; i<month; i++) {
			sum += dates(year,i);
		}
		
		// 3) month월의 day 일까지의 합 = [month월의 1일부터 day 일까지의 합]
		sum += day;
				
		//dayMode에 총합 %7을 넣어주자. -> 2019년 4월 15일은 월요일입니다.
		String res = dayMode(sum%7);
		System.out.printf("%d 년 %d 월 %d 일은 %s 입니다.",year, month, day, res);	//마지막날 dates, 앞은 sum%7
		
		*/
	}
	

	
	public void input(int year, int month) {
		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요 : ");
		int a = sc.nextInt(year);
		System.out.println("월을 입력하세요 : ");
		int b = sc.nextInt(month);
		
		System.out.println("------["+year+"년 "+month+"월]------");
		System.out.println("  일    월   화    수    목   금    토");

        
        int dateOfWeek = (dates(year, month)+1-1)%7;
        int beforeLastDay = isBeforeDays(year, month);
        int startLastDay = beforeLastDay-dateOfWeek+1;
        int lastDay = lastDay(year, month); 
        int lastWeekDays = (7-(dateOfWeek+lastDay)%7)%7;
        if(isLeapYear(year)){
            startLastDay++;
            lastWeekDays++;
        }
        
        for(int i=startLastDay; i<=beforeLastDay; i++) {
            System.out.printf("%d\t", i);
        }
 
        for(int i=1; i<=lastDay; i++) {
            System.out.printf("%d\t", i);
            if((dateOfWeek+i) % 7 == 0) {
                System.out.println();
            }
        }
        
        for(int i=1; i<=lastWeekDays; i++) {
            System.out.printf("%d\t", i);
        }
        
    }
	
	public int isBeforeDays(int year, int month) {
        int days = 0;
        if(month==1) {
            days = lastDay(year-1, 12);
        }else {
            days = lastDay(year, month-1);
        }
        return days;
    }

 
    public int lastDay(int year, int month) {
        int lastDay = 0;
        if(isLeapYear(year))  {
        	lastDay = dates(year-1, 12);       	
        }
        else {
        	lastDay = dates(year, month-1);
        }
        return lastDay;
    }
    
    }