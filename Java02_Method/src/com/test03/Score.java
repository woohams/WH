package com.test03;

public class Score {

	public static void main(String[] args) {
		
		int sum = Student.getSum(100, 45, 79);
		System.out.println(sum);
		
		double avg = Student.getAvg(sum);
		System.out.println(avg);
		
	}

	
}
