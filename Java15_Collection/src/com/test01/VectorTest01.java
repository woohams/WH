package com.test01;

import java.util.Vector;

// Collection : 여러 개의 값을 효과적으로 관리하기 위한 객체 ( Array와 다른 점 : 다른 형태여도 상관 x, 배열과 다르게 가변적)
public class VectorTest01 {
	
	public static void main(String[] args) {
		
		
		// Vector() : 용량이 10인 기본 Vector (기본 사이즈가 10)
		// Vector(iCa) : iCa만큼 용량 지정
		// Vector(iCa, capaInc) : iCa 크기 지정, 기본 용량을 넘기면 capaInc 만큼 capacity 증가
		 
		Vector v = new Vector(10, 5);
		
		for(int i = 1; i<=10; i++) {
			v.add(i);
			
		}
		System.out.println(v);
		System.out.println(v.size()+" : "+v.capacity());
		
		v.add("11");	// int, string 다 들어 갈 수 있다. 	(type이 다른 형태여도 상관 없다. - 배열과 다른점)
						//							(배열은 크기가 고정이지만 collection(vector)는 가변적이다. 11 추가시 크기 증가)
		System.out.println(v);
		System.out.println(v.size()+" : "+v.capacity());
		
		// size : 크기(길이)
		// capacity : 용량
	}
	
}
