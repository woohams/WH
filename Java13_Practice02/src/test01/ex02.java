package test01;

import java.util.Random;

public class ex02 {
	
	public void StarSquare() {
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 11; j++) {
				if(i==0 || i==5) {
				System.out.print("*");
				}else if(j==0) {
					System.out.print("*");
				}else if(j<11) {
					System.out.print(" ");
				}else if(j==11) {
					System.out.print("*");
				}
				
			}System.out.println();
		}
		
	}
	
	public void StarDiamond() {
		
		for (int i = 0; i < 5; i++) {	
	        for (int j = 4; j > i; j--) {	// 공백 0.4 부터(5번째자리) 	
	            System.out.print(" ");
	        }

	        for (int k = 1; k <= i*2+1; k++) {	// 0->5 1->456 ...
	        	System.out.print("*"); 
	        	}
	        System.out.println();	// 중간 가장 긴줄까지 *
	    }    

	        for (int i = 0; i < 4; i++) {	// 아랫부분
	            for (int j = 0; j <= i; j++) {
	                System.out.print(" ");
	                }

	            for (int k = 7 ; k >= i*2+1; k--) {
	                System.out.print("*");
	            }
	            System.out.println();
	            
	        }
	}

	
	public static int Fibonacci(int n) {
        
		int r1 = 1;
		int r2 = 1;
		int r3 = 0;
        
		if(n<=2) {
			System.out.printf("%d년 %3d월 = %3d쌍 %3d마리",n/12,n%12,r1,r1*2);
			return 1;
		}else {
        for(int i=2; i < n; i++) {
            r3 = r1+r2;
            r1 = r2;
            r2 = r3;
            } 
        System.out.printf("%d년 %3d월 = %3d쌍 %3d마리",n/12,n%12,r3,r3*2);
        return r3;
		}
    }
}
	




