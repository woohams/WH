package com.test03;

public class PrnTest {
	
	public static void main(String[] args) {
	// type 변수 = 값;
	// type 변수; (선언)
	// 변수 = 값; (초기화)
	
	int i;		// 선언, 정의
	i = 100;	// 초기화

	/*
	 * System.out.print()	: 줄 바꿈 없음
	 * System.out.println()	: 줄 바꿈 있음
	 * System.out.printf()	: 줄 바꿈 없음, 자리/형식 지정
	 * 'f' -> formatter
	 * ...printf(String format, object,...args) // 1 more
	 */
	System.out.print("1.i : " +i);
	System.out.println(" 2.i : " +i);
	System.out.printf("3.i : %d \n", i);	// %d : 10진수(decimal integer)
	System.out.printf("%10d %5d", i,i);		// 10칸, 5칸 자리수 잡아주기
	
	// 문제
	int su = 100;
	char ch = 'A';
	double d = 90.50;
	
	//시험 정수 결과는 100(su)점이고, 학점은 'A'(ch)가 나왔다.나의 오늘 감정지수는 90.50%(d) 이다.
	System.out.printf("\n시험 점수 결과는 %d점이고, 학점은  '%C'가 나왔다. 나의 오늘 감정지수는 %.2f%%이다.", su, ch, d);
	
	}
}
