package com.test01;

import java.util.Vector;

public class VectorTest02 {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();	
		
		v.add("홍길동");
		v.add("이순신");
		v.add("김선달");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		
		printVector(v);
		transElem(v);
	}
		// 1. foreach문을 사용하여 vector 전체 출력
		private static void printVector(Vector<String> v) {

		// for (담아줄 변수 : 배열/컬렉션 )
		for(String s : v) {
			System.out.print(s+" ");
			//printVector(v);
		}System.out.println();
	}
		
		
		// 2. "홍길동" 이라는 값의 인덱스를 찾아 홍길순으로 바꾸자.
		private static void transElem(Vector<String> v) {
		v.set(v.indexOf("홍길동"), "홍길순");
		
		// 3. "~신"으로 끝나는 값을 찾아서 만일 있다면 "~신"을 "~자"로 바꾸자.
		for(int i = 0; i <v.size(); i++) {
			if(v.get(i).endsWith("신")) {
				v.set(v.indexOf(v.get(i)), v.get(i).replace("신", "자"));
				//v.set(i, v.get(i).replace("신", "자");
			}
		}printVector(v);
		
		
		// 4. "~호"로 끝나는 값을 찾아서 만일 있다면 해당 값을 삭제하자.
		for(int i=0; i< v.size(); i++) {
			if(v.get(i).endsWith("호")) {
				//v.remove(i);
				v.remove(v.get(i));
			}
		}
		printVector(v);
		//transElem(v);
		
	}
}




