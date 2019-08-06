package com.book;

import com.compare.Score;

public class MTest {
	public static void main(String[] args) {
		
		/*
		 * 1. Book 객체를 관리하는 cyobo라는 이름의 배열을 만들자
		 * 배열의 크기는 5
		 * 
		 * 2. Book 객체를 5개 만들자.
		 * ex) 이름 : "a" / 페이지 : 50 / 가격 : 5000 / 종류 : "만화책"
		 * 
		 * 3. 2에서 만든 Book 객체들을 cyobo 배열에 저장하자.
		 * 
		 * 4. cyobo 배열을 전체 출력하자.
		 * 
		 */
		// 1.Book 객체를 관리하는 cyobo라는 이름의 배열을 만들자.배열의 크기는 5
		Book[] cyobo = new Book[5];
		
		
		// 2. Book 객체를 5개 만들자.
		
		Book b1 = new Book("abcde",50,50,"만화");
		Book b2 = new Book("a",50,50,"만화");
		Book b3 = new Book("ab",50,50,"만화");
		Book b4 = new Book("abc",50);
		Book b5 = new Book("abcd",50,50,"만화");

		
		cyobo[0] = b1;
		cyobo[1] = b2;
		cyobo[2] = b3;
		cyobo[3] = b4;
		cyobo[4] = b5;
		
		for(Book b : cyobo) {
			System.out.println(b);
		}
	}
}
	
