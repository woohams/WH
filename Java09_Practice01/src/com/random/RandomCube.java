package com.random;

public class RandomCube {
	
	public static void main(String[] args) {
		cube();
	}
	public static void cube() {
		
		// 1. 랜덤한 숫자로 채워진 5*5의 큐브를 만들자.
		//	   랜덤한 숫자는 1~9 사이의 숫자
		int min = 1;
		int max = 9;
		int sumX = 0;	// 카멜 표기법 : sumX -  새로운 단어가 나오면 대문자(java에서 주로 사용)
		int sum = 0;	// 스네이크 표기법 : sum_x - 새로운 단어가 나오면 언더바(c에서 주로 사용) 
						// ctrl + shift + f : eclipse는 java기반이기 때문에 java형태로 맞춰준다.
		
		for(int i = 0; i < 5; i++) {
			for(int j =0; j<5; j++) {	
				int ran = (int)(Math.random()*(max-min+1))+min;	// min, max 따로 선언할 필요없이 (Math.random()*9(9-1+1)+1) 로 선언해도 된다.
				System.out.print(ran+" ");	//랜덤 5*5 출력
					
				// 3. 랜덤 큐브의 총 합을 구하자.
				sum += (int)ran;
				// 2. 랜덤 큐브에 x의 합을 구하자.
				if((i==j || j+j==4)) {
					sumX += (int)ran;
					
				}
			}
			
			if(i % 4==0) {	// i값이 4의배수일 때마다 줄바꿈		
			}
			System.out.println();		
		}

		
		
		// 2. 랜덤 큐브에 x의 합을 구하자.

			System.out.println("랜덤 큐브에 X의 합은 : "+sumX);
		
			
		// 3. 랜덤 큐브의 총 합을 구하자.
		
			System.out.println("랜덤 큐브의 총 합 : "+ sum);
		// 4. 랜덤 큐브의 총  평균을 구하자.
			System.out.printf("랜덤 큐브의 총 평균 : %.2f", (float)sum/25);
	}

}
