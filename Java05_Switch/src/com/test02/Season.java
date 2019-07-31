package com.test02;

public class Season {
	
	public static String prn(int month) {
		
		String season = "";
		
		/*
		 * switch를 사용해서 month로 돌아온 값이
		 * 12,1,2 일 때는 "겨울"
		 * 3,4,5 일 때는 "봄"
		 * 6,7,8 일 때는 "여름"
		 * 9,10,11 일 때는 "가을"
		 * 이라고 리턴하자.
		 */
		
		switch(month) {
		
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		}
					
		return season;
		
		}
	}

