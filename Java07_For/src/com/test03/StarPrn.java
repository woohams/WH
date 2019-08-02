package com.test03;

public class StarPrn {
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 
	 */
	public void starOne() {
		
		// i는 줄
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j< i+1 ; j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
		
	}
	
	public void starTwo() {
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		/*for(int i = 4; i >= 0; i--) {
			
			for(int j = 0; j< i+1 ; j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}*/
		
		//줄
		for(int i = 0; i < 5; i++) {
			// j* : (5-0, 5-1, 5-2, 5-3, 5-4)
			for(int j = 0; j < 5-i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void starThree() {
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		/*for(int i = 1; i < 6; i++) {
			
			for(int j = 5; j >0 ; j--) {
				if(i<j) {
					System.out.print("    ");
				} else {
					System.out.print("★");
					}
				}
			System.out.println();
		}*/
		
		
		/*
		for (int i =0; i<5; i++) {
			for (int a=4; a>i; a--) {
				System.out.print(" ");
		}
		for (int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		}*/
		
		//i 줄
		for(int i = 0; i<5; i++) {
			
			// j : (4-0, 4-1, 4-2, 4-3, 4-4) 공백
			for(int j=0; j <4-i; j++) {
				System.out.print('　');
				
			}
			// k : (1+0,1+1,1+2,1+3,1+4)
			for(int k=0; k<1+i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void starFour() {

		/*
		 * ***** 0 - 5 - 0
		 *  **** 1 - 4 - 1
		 *   *** 2 - 3 - 2
		 *    ** 3 - 2 - 3
		 *     * 4 - 1 - 4
		 */
		

		/*for(int i = 5; i < 0; i--) {

			// j* : (5-0, 5-1, 5-2, 5-3, 5-4)
			// " ": (0, 1, 2, 3, 4)
			
			for(int j = 0; j < 5-i; j++) {

			System.out.print("*");
			}
			for(int k = 0; k>4;k++)
				System.out.print(" ");
		}
			
			System.out.println();*/
		
		/* 형꺼
		for(int i = 0; i < 5; i++) {		// i = 줄
			for(int k = 1; k < i +1; k++) {	// k = 공백
				System.out.print('　');
			}
			for(int j= 5; j > i; j--) {		// j = ★
				System.out.print("★");
			}
			System.out.println();
		}*/
		
		//강사님꺼
		for(int i = 0; i< 5; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("　");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
				
		}
		
		}
	
	
	
	public void starFive() {
		/*
		 * 		*
		 * 	   ***
		 *    *****
		 *   *******
		 *  ********* 
		 */
		
		/*
		for(int i = 0; i < 5; i++){
			
			for(int j = 0; j < 4-i; j++){
				
				System.out.print(" "); 
				}
			
			for(int j = 0; j < 2*i+1; j++){
				System.out.print("*"); 
				
			}		
			System.out.println();	
		}*/
		//줄
		for(int i = 0; i < 5; i++) {
			//j'' = (4-0, 4-1, 4-2, 4-3, 4-4)
			for(int j=0; j<4-i; j++) {
				System.out.print("　");
				
			}
			// k* = (2*0+1, 2*1+1,2*2+1,2*4+1)
			for(int k = 0; k<2*i+1; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

	
	
}







