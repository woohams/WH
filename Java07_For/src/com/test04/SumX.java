package com.test04;

public class SumX {
	
	public static void main(String[] args) {
		
		sumPrn();
		
	}
	/*
	 *  1  2  3  4  5
	 *  6  7  8  9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * X의 총 합 : 117
	 */
	public static void sumPrn() {
	
	/*for(int i=1; i<26; i++){
		if(i>9) {
			System.out.print(" "+i);
		}else {
		System.out.print("  "+ i);
		}
		if(i % 5 ==0) {
			System.out.println();
		}

		
		}
	System.out.printf("X의 총합 : " );
		
		
	}*/

		// 나머지로 계산하는 방법
		/*
		 * 00 01 02 03 04
		 * 10 11 12 13 14
		 * 20 21 22 23 24
		 * 30 31 32 33 34
		 * 40 41 42 43 44
		 * 
		 * 00, 11, 22, 33, 44 (i == j)
		 * 01, 13, 22, 31, 40 (i+j == 4)
		 */
		
		int cnt = 1;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j =0; j<5; j++) {	
			
				if((i==j) || (i+j==4)) {	// 13이 두번 걸려도 ||로 중복 x
					sum+=cnt;
				}
				System.out.printf("%2d ", cnt++);

			}
			System.out.println();
			
			}
			
		System.out.print("X의 총합 : " +(sum));	
	}
	
	
	
}
