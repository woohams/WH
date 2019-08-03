package com.cal;

public class Cal {
	private final int[] LEAF = {31,29,31,30,31,30,31,31,30,31,30,31}; // 윤년
    private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31}; // 평년
	
	public void calendarLoop(int year) {
        for(int i=1; i<=12; i++) {
            calendarMake(year, i);
            System.out.println("\n\n");
        }
    }
    
    /**
     * 윤년 판단 메소드
     * @param year 년도
     * @return true : 윤년  / false : 평년
     */
    public boolean iscLeafCheck(int year) {
        boolean isc = false;
        if(year%4==0 && year%100!=0 || year%400==0) { // 윤년이면
            isc = true;
        }
        return isc;
    }
    
    public int days(int year) { // 년도에 따른 일수 누적
        int daySum = 0;
        for(int i=1; i<year; i++) {
            if(iscLeafCheck(i)) {
                daySum += 366;
            }else {
                daySum += 365;
            }
        }
        return daySum;
    }
    
    public int days(int year, int month) { // 년도누적 + 월 일수 누적
        int daySum = days(year);
        for(int i=1; i<month; i++) {
            daySum += PLAIN[i-1];
        }
        if(month>=2 && iscLeafCheck(year)) {
            daySum++;
        }
        return daySum;
    }
    
    public int days(int year, int month, int day) { // 년도누적 + 월 누적 + 일 일수 누적
        return days(year, month)+day;
    }
    
    public void calendarMake(int year, int month) {
        System.out.printf("\t\t %d년 %d월 %n",year, month);
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
        
        int dateOfWeek = (days(year, month, 1)+1-1)%7;
        int beforeLastDay = isBeforeDays(year, month);
        int startLastDay = beforeLastDay-dateOfWeek+1;
        int lastDay = lastDay(year, month); // 구하고자 하는 년월의 최대 일수
        int lastWeekDays = (7-(dateOfWeek+lastDay)%7)%7;
        if(iscLeafCheck(year)){
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
 
    private int lastDay(int year, int month) {
        int lastDay = 0;
        if(iscLeafCheck(year)) {
            lastDay = LEAF[month-1];
        }else {
            lastDay = PLAIN[month-1];
        }
        return lastDay;
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
}
