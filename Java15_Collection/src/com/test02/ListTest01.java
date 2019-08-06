package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// 입력 하는 순서가 있다.
		// 중복이 가능하다.
		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("김선달");
		list.add("유재석");
		list.add("신동엽");
		list.add("조세호");
		list.add("김선달");
		System.out.println(list);
		
		transElem(list);
		
	}
	private static void transElem(List<String> list) {
		//1. 홍길동을 김길동으로 바꿔보자.
		list.set(list.indexOf("홍길동"), "김길동");
		System.out.println(list);
		
		//2. ~신으로 끝나는 값을 찾아서 만약 있다면 ~자로 바꾸자.
		for(int i=0; i<list.size();i++) {
			if(list.get(i).endsWith("신")) {
				list.set(i, list.get(i).replace("신", "자"));
			}
			
		}
		System.out.println(list);
		
		//3. 끝 글자가 "호"인 값을 찾아서 삭제하자.
		for(int i=0; i<list.size();i++) {
			if(list.get(i).endsWith("호")) {
				list.remove(i);
			}
		}System.out.println(list);
	}
}
