package com.test01;

public class SwitchTest01 {

	public static void main(String[] args) {
		
		Prn01();
		Prn02();
		
	}
	
	
	// if는 순차적으로 모든 코드를 읽어드리지만 switch는 해당 case로 jumping하기 때문에 컴파일러가 작업하기 수월하다.
	public static void Prn01() {
		
		int i = 2;
		
		switch(i) {
		
		case 1:
			System.out.println("1 입니다.");
		case 2:
			System.out.println("2 입니다.");
		case 3:
			System.out.println("3 입니다.");		//2 입니다.
												//3 입니다. 출력
												//break를 안써주면 원하는 값 이후에 것들까지 모두 출력
			
			int j = 2;
			
			switch(j) {
			
			case 1:
				System.out.println("1 입니다.");
				break;
			case 2:
				System.out.println("2 입니다.");	//2입니다.
				break;
			case 3:
				System.out.println("3 입니다.");	
				break;
			default :
				System.out.println("다른 숫자 입니다.");	//case 외의 숫자가 들어가면 실행. ex)int j = 5 일때
			
			}
			
		}
	
	}
	
	public static void Prn02() {
		
		int i = 2;
		
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수 입니다.");
			break;
		case 2:		//break가 없기때문에 case 4의 명령을 실행한 뒤 break가 걸려 종료
		case 4:
			System.out.println("짝수 입니다.");
			break;
		default:
			System.out.println("다른 수 입니다.");
				
		}
	}
}
	
	

