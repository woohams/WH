package com.test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		int a = 0;
		
		try {
			System.out.println("숫자를 입력해 주세요.");
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			
			if(a == 3) {
				throw new MyException();	// 특정 예외를 발생시키는 키워드 throw
			}
			
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요!");
			e.printStackTrace();
			
		}catch(MyException e) {
			System.out.println("내가 만든 예외!");
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("어쨋든 예외!");
			e.printStackTrace();
			
		}finally {
			System.out.println(a);
		}
	}
	
}
