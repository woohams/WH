package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCalc {
	
	public int inputNum() {
		int n = 0;
		
		System.out.println("숫자만 입력해 주세요 : (숫자 아니면 예외!)");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		return n;
	}
	
	public int calculation() {
		int res=0;
		
		while(true) {
			try {
				res = inputNum()/inputNum();
				System.out.println(res);
				
				int sum = res + Integer.parseInt("10");
				
				break;	// 정상 동작하는 코드들(그러나 예외처리가 발생할 수 있는 코드들)
			}catch(InputMismatchException e){	// 발생 된 예외
				System.out.println("숫자만 입력해 주세요.");	// 해당 예외가 발생했을 때 실행할 명령				//e.printStackTrace();	
														// 어디서 에러가 났는지 stack 구조로 하나씩 찾아간다.

			}catch(NumberFormatException e) {
				System.out.println("숫자만 변환해 주세요.");
				//e.printStackTrace();
			}
		}
		
		return res;
	}

}
