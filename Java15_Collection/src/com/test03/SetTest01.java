package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		//    Set :	순서가 없다.
		// 			중복 x

		Set<String> st = new HashSet<String>();
		st.add("1");
		st.add("3");
		st.add("5");
		st.add("2");
		st.add("4");
		//st.add(null);	// null 값을 넣을 수는 있지만 사용하면 NullPointerException(exception!)
		st.add("6");
		st.add("7");
		st.add("7");
		st.add("7");	// 중복 안됨.
		System.out.println(st);
		
		setFind(st, "7");

		setDelete(st,"5");
	}

	

	private static void setFind(Set<String> st, String string) {
		
		for(String s : st) {
			if(s.equals(string)) {
				System.out.println("찾았다!"+s);
			}
		}
		
	}
	private static void setDelete(Set<String> st, String string) {

		for(String s : st) {
			if(s.equals(string)) {
				st.remove(s);	// ConcurrentModificationException
				System.out.println("지웠다!"+s);
				break;	// 위에 error를 막아서 프로그램을 멈춰준다.
			}
		}
		System.out.println(st);
	}

}
//NullPointerException : null에다가 기능을 하려고 할 때.