package com.test02;

import java.util.Arrays;

public class DeepCopy {
	
	public static void main(String[] args) {
		int [] original = {10,20,30,40,50};
		int[] copyOne = new int[original.length];
		
		// 1. 배열 인덱스를 통해 값을 가져와서 복사 -> 값 복사
		for(int i=0; i<original.length; i++) {
			copyOne[i] = original[i];
		}
		System.out.println("original : "+Arrays.toString(original));
		System.out.println("copyOne : "+Arrays.toString(copyOne));	// copyOne = original
		copyOne[2] = 300;
		System.out.println("original : "+Arrays.toString(original));
		System.out.println("copyOne : "+Arrays.toString(copyOne));	// copyOne의 2번째 주소지 값만 300으로 변경, original은 그대로 30
		
		System.out.println(original.hashCode());
		System.out.println(copyOne.hashCode()); 	// ShallowCopy와는 다르게 opriginal과 copyOne의 주소값이 다르다.
		
		System.out.println("================================");
		// 2. original에게 요청하여 복사
		int[] clone = original.clone();
		System.out.println(Arrays.toString(clone));
		System.out.println(clone.hashCode()); 	// original hashCode와 다름
		System.out.println("================================");
		
		// 3. System을 사용하여 복사
		// System.arrayCopy(원본 배열객체, 원본 시작위치, 복사 배열객체, 복사 시작위치, 복사 갯수);
		int[] systemArray = new int[5];
		Arrays.fill(systemArray, 999);	// value 값으로 배열을 다 채워라 - fill
		System.out.println(Arrays.toString(systemArray));
		System.arraycopy(original,  0,  systemArray,  1,  2);	// 1번지부터 2개를 복사. 999, 10, 20, 999, 999 
		System.out.println(Arrays.toString(systemArray));
		System.out.println("================================");
	}

}


