package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("5");
		list.add("2");
		list.add("1");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("3");
		list.add("4");
		list.add("7");
		list.add(String.valueOf(6));
		
		System.out.println(list);
		
		Collections.sort(list, new MySortTest());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list); 	// [1, 10, 2, 3, 4, 5, 6, 7, 8, 9] String이라서.
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
	
	}
}

class MySortTest implements Comparator<String> {

	
	@Override
	public int compare(String o1, String o2) {
		int left = Integer.parseInt(o1);
		int right = Integer.parseInt(o2);
		
		if(left>right) {		// 왼쪽이 크면 1, 오른쪽이 크면 -1, 같으면 0 : 오름차순
			return 1;
		}else if(left<right) {
			return -1;
		}
		return 0;
	}
	
	
}
/*
 * comparator : 객체 바깥에서 comparator를 상속받은 객체를 대려와 같이 사용한다. 메소드 내부에 들어가는 파라미터 1, 2개	// 비교 할 때 값을 가져와서 비교함
 * compareTo(Comparable) : 해당 객체 내부에 존재, 알아서 정렬해준다. 메소드 내부에 들어가는 파라미터 1개			// 비교 할 때 알아서 값을 비교함
 * 
 * 
 * 
 * 
 * 
 * 
 */



