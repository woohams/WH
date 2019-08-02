package com.test01;

public class ForTest01 {

	public static void main(String[] args) {

		prn01();
		prn02();
		prn03();
	}
	
	public static void prn01() {
		
		int i = 0;
		
		//초기값; 조건식; 증감식
		for(i = 0; i < 10; i++){
		System.out.println(i);
		}
		System.out.println("for 문이 종료된 후의 i값 : " + i);
	}
	
	public static void prn02(){
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		//System.out.println("i 값 : " + i); // i 값을 for문 밖에서 선언 안해놨기 때문에 사용할 수 없다.
	}
	
	public static void prn03() {
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
		}
		
	}

}
