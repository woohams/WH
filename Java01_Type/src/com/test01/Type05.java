package com.test01;

public class Type05 {

	public static void main(String[] args) {
		
		/*
		 *  기본타입 -> 참조타입(wrapper class)
		 * 1.byte ->Byte
		 * 2.short -> Short
		 * 3.int -> Integer
		 * 4.long -> Long
		 * 5.float -> Float
		 * 6.double -> Double
		 * 7.char -> Character
		 * 8.boolean -> Boolean
		 * 
		 */
		
		System.out.println("byte의 범위: "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short의 범위: "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("int의 범위: "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long의 범위: "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("float의 범위: "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("double의 범위: "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("char의 크기: "+Character.SIZE);
		System.out.println("boolean 참: "+Boolean.TRUE);
		System.out.println("boolean 참: "+Boolean.valueOf("true"));	// wrapper class는 값 자체만 가져오는게 아니라 어떤 기능을 추가하기위해 사용한다. "123" -> faluse
	}
	
	
	
}
