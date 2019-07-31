package com.test03;

public class Score {
	
	public double getAvg(int kor, int eng, int math) {
		
		double avg = (double)(kor + eng + math) / 3;	//Java 기본연산이 int형이라 double로 형변환해야 소숫점 값이 안날아감.
		
		return avg;
	}
	
	
	public String getGrade(double avg) {
		
		String grade = "";
		
		
		switch((int)avg/10) {
		
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default :
			grade = "F";;
			
		}		
		
		return grade;
	}

}







