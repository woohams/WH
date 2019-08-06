package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		
		// 1. Score타입의 값 3개를 관리하는 배열을 만들자. (변수명 : school)
		Score [] school = new Score[3];
		
		// 2. school 안에 짝궁 2명과 자신, 총 3명의 Score 객체를 만들어 저장하자.
		Score sc01 = new Score();
		sc01.setName("나");
		sc01.setKor(90);
		sc01.setEng(77);
		sc01.setMath(60);
		
		Score sc02 = new Score("예비",100,67,93);

		school[0] = sc01;
		school[1] = sc02;
		school[2] = new Score("최고",100,65,61);

		// 3. school 배열을 전체 출력하자.
		/*for(int i =0; i<school.length; i++) {
			System.out.println(school[i]);
		}*/
		
		// 향상 된 for문(for each문)
		for(Score s : school) {
			System.out.println(s);
		}
		
		int[] temp = {1,6,5,2,10,7,8,3,4,9};
		/*System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);	// 정렬
		System.out.println(Arrays.toString(temp));*/
		
		Arrays.sort(school);
		for(Score s : school) {
			System.out.println(s);
		}
		
	}

}










