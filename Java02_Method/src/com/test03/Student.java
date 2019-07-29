package com.test03;

public class Student {

	
	public static void main(String[] args) {
		
		int kor, eng, math;
		kor = eng = math = 0;
		
		kor = 100;
		eng = 45;
		math = 79;
		
		int sum;
		double avg;
		
		//1. getSum메소드를 만들자. 정수형 파라미터3개(int), 리턴타입 int, 접근제한자 public, 메모리영역 static
		
		//2. getAvg메소드를 만들자. 정수형 파라미터 1개(int), 리턴타입 double, 접근제한자 public, 메모리영역 static
		
		//3. getSum메소드를 이용하여 국어, 영어, 수학의 총점수를 계산하여 sum 변수에 대입하자. 
		sum = getSum(kor, eng, math);
		
		//4. getAvg메소드를 이용하여, 총 합의 평균을 계산하여 avg변수에 대입하자.
		avg = getAvg(sum);
		
		//5. sum 변수와 avg 변수를 출력하자.
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println(String.format("%.2f", avg));
	}

		public static int getSum(int i, int j, int k) {
			
			int sum = i + j + k; 
			
			return sum;
		}
		
		public static double getAvg(int s) {
			
			double res = (double)s / 3;
			
			return res;
		}
		
	}

	

