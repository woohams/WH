package com.test01;

public class Iftest01 {

	
	public static void main(String[] args) {
		
		prn01();
		prn02(false, false);
	}
	public static void prn01() {
		
		int i = 10;
		int j = 20;
		
		//if(조건) {명령;}
		if(i > 0) {
			System.out.println(i + "은 0보다 큽니다.");
			
		}
		
		//if (조건) { 명령; } else {명령; }
		if(j<10) {
			System.out.println(j + "은 10보다 작습니다.");
			
		}else {
			System.out.println(j + "은 10보다 작지 않습니다.");
			System.out.println("10보다 크거나 같습니다.");
		}
				
	
	
	//if(조건){명령; } else if(조건){명령; }...
	if(i < j) {
		System.out.println("i가 j보다 작습니다.");
		}else if(i == j) {	//위에 조건이 참이므로 실행하지 않습니다.
			System.out.println("i와 j보다 같습니다.");
		}else if(i > j) {
			System.out.println("i가 j보다 큽니다.");
		}else {
			System.out.println("모든 조건이 거짓일 때!!");
		}
	}
	
	public static void prn02(boolean ring, boolean married) {
		
		if(ring) {
			if(married) {
				System.out.println("결혼하셨네요!");	//syso or sout + ctrl +space = 자동완성
			}else {
				System.out.println("연인이 있네요!");
			}
		}else {
			if(married) {
				System.out.println("결혼은 하셨는데...?");
			}else {
				System.out.println("솔로...ㅜㅜ");
			}
		}
		if(ring && married) {
			System.out.println("결혼하셨군요!!");
		}else if(ring || married) {
			System.out.println("애인이 있으시군요!!");
		}else {
			System.out.println("솔로...ㅠㅠ");
		}
		
	}
}
	
	
	

