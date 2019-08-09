package com.test02;

public class SleepTest {
	
	public static void main(String[] args) {
		
		while(true) {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(500);	// 실행하고 있는 쓰레드는 ()만큼 멈춰라. 500 -> 0.5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("%c ",'♥');
				
			}
			System.out.println();
		}
		
	}

}




