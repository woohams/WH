package com.lotto;

//1~45 사이의 중복되지 않는 6개의 랜덤한 숫자를 가지는 배열 
//중복 값 배열
//로또 배열 생성
//정렬
//로또 배열 출력
public class Lotto1 {
	
	//중복 값 배열
	private boolean isSame(int[] arr, int insert) {
		boolean same = false;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == insert) {
				same = true;
				break;
			}
		}	
		return same;
	}
	
	//로또 배열 생성
	private int[] make() {
		int [] arr= new int[6];
		
		int index = 0;
		while(index < 6) {
			int randomNumber = (int)(Math.random()*45)+1;
			
			if(!isSame(arr, randomNumber)) {	// 같은 값이 아니라면
				arr[index] = randomNumber;
				index++;
				
			}
		}sorting(arr);
		
		return arr;
	}
	
	//정렬
	public void sorting(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;					
				}
			}
		}
	}
	
	//로또 배열 출력
	public void prn() {
		int[] arr = make();
		
		System.out.print("[");
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
		System.out.println("]");
	}

}
