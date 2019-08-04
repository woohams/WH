package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		//AA a = new AA();
		//Super s = a;
		Super s = new AA();
		s = new BB();
		// 부모 타입에 자식 객체를 넣을 수 있지만 자식 타입에 부모 객체를 넣을수는 없다.
		
		//AA a = (AA)new Super();
		BB b = (BB)s;	// s = new BB(); BB를 담으면 다운캐스팅 가능, Super s = new AA(); AA가 담겨 있기 때문에 불가능
	}

}
