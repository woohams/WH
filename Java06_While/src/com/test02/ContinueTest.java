package com.test02;

public class ContinueTest {
	
	public static void main(String[] args) {
		
		prn();
		
		
	}
	
	public static void prn() {
		// 1~10 사이의 홀수만 출력하자.
	int i = 0;
	while(i <= 10) {
		i++;
		if(i % 2 ==0) {
			continue;	//해당 코드블록의 가장 윗부분으로 넘어간다. ->while(i <= 10)문으로 이동, 아랫줄은 실행 x
		}				//결과 값은 홀수만 출력된다.(i%2==0은 System.out.println을 못하기때문)
		System.out.println(i);
		}
	}
}
	
	

