package com.test01;

import java.util.Arrays;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		
		// 다차원 배열
		
		//방법 1
		int [][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		
		/*
		 * 	1 2
		 * 	3 4
		 * 	5 6
		 */
		
		// 방법 2
		int[][] b = new int[3][];
		b[0] = new int[3];	// b의 0번째에 3칸짜리 배열 생성
		b[1] = new int[5];	
		b[2] = new int[1];
		
		/*
		 *  o o o
		 *  o o o o o
		 *  o 
		 */
		
		// 방법 3
		int[][] c = new int[][] {
									{1,2},
									{3,4,5,6,},
									{7},
									{8,9,10}
								};
								
								
		// 방법 4
		int [][] d = {{1,2,3,4},{5,6,},{7},{8,9,10}};
		
		
		// 출력
		System.out.println(Arrays.toString(a));
		prn(a);
		//prn(b); // 비었음
		prn(c);
		prn(d);
		
	
		String[][] s = {
				{"hava", "a", "nice", "day"},
				{"너무", "어려워",},
				{"배열", "이차원", "배열"}
		};	//nice -> good, 어려워 -> 쉬워로 바꿔 전체 출력
		modi(s);
		}
	
	public static void modi(String[][] arr) {
		
		arr[0][2] = "good";
		arr[1][1] = "쉬워";
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;  j++) {
				System.out.print(arr[i][j]+ " ");		// 라인 수 번호를 더블클릭하여 break point 지정 후 debug 가능
			}
			System.out.println();
		}
	}
	
	public static void prn(int[][] arr) {
		
		// i는 큰 배열의 길이
		for(int i = 0; i <arr.length; i++) {
			// j는 작은 배열의 길이
			System.out.print("{ ");
			for(int j = 0; j < arr[i].length;  j++) {	//arr[i].length는 각각 큰 배열에 들어가 있는 작은 배열의 길이를 의미한다.

				System.out.print(arr[i][j] + " ");
			}
			System.out.print("}");
				System.out.println();
		}
		System.out.println();
	}

		
	}
	


