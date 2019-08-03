package com.lotto;

import java.util.Scanner;

// 1~45 사이의 중복되지 않는 6개의 랜덤한 숫자를 가지는 배열 
// 중복 값 배열
// 로또 배열 생성
// 정렬
// 로또 배열 출력
public class Lotto {

	public static void main(String[] args) {
		System.out.println("번호 6개를 입력해주세요.");
		Scanner sc = new Scanner(System.in);

		int bun6 = sc.nextInt();
		int Lotto[] = new int[6];
		System.out.print("로또 당첨번호는  ");

		// 1~45 사이의 중복되지 않는 6개의 랜덤한 숫자를 가지는 배열
		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 45)+1; 
			
			// 중복 값 판별
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
				}
				
				// 정렬
				if(Lotto[i]<Lotto[j]) {
					int temp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = temp;
				}
	
			}
		}
			
		
		// 로또 배열 출력
		for (int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i] + " ");
		}
		System.out.print("번 입니다.");
	}
}