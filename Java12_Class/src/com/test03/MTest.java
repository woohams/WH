package com.test03;

public class MTest {
	public static void main(String[] args) {
		
		Mysum s = new Mysum();
		
		System.out.println(s.sum(1));
		System.out.println(s.sum(2, 3));
		System.out.println(s.sum(4, 5, 6));
		System.out.println(s.sum(7.8, 9.1));
	}

}
