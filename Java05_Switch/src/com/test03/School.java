package com.test03;

public class School {
	
	public static void main(String[] args) {
		
		String name = "진우현";
		int kor = 93;
		int eng = 66;
		int math = 88;
		
		Score sc = new Score();
		String res = sc.getGrade(sc.getAvg(kor, eng, math));
		System.out.println(name +"님의 등급은 "+res +"입니다.");
		
	}

}
