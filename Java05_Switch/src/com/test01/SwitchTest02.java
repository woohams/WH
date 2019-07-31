package com.test01;

public class SwitchTest02 {

	public static void main(String[] args) {
		
		// switch()에 들어갈 수 있는 type :
		// 정수, 문자형, 문자열(java 7버전 이후부터 사용 가능)
		
		String s = "한국";
		
		switch(s) {
		
		case "한국":
			System.out.println("Korea");
			break;
		case "중국":
			System.out.println("China");
			break;
		case "일본":
			System.out.println("Japan");
			break;
		default:
			System.out.println("다른 나라");
		}
		

	}

}
