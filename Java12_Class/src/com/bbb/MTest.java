package com.bbb;

//class 앞에는 public, (default), final 만 가능 
//								: 더 이상 불가능 
public class MTest {

	public static void main(String[] args) {
		BBB b1 = new BBB();	// BBB라는 클래스를 가지고 메모리 어딘가에 new BBB(객체, Instance)를 만들어라.
							// 기본 생성자 호출
		b1.setAbc(1);
		b1.setB(2);
		System.out.printf("%d + %d = %d",b1.getAbc(), b1.getB(), b1.getSum());
		//BBB가 AAA를 상속 받고있기 때문에(BBB extends AAA) AAA가 먼저 만들어지고 BBB가 만들어진다. 상위 클래스의 주소가 전달된다.
		b1.prn();
		
		BBB b2 = new BBB(3);
		b2.setB(4);	// 4를 받아옴(setter 이용)
		System.out.printf("%d + %d = %d\n", b2.getAbc(), b2.getB(), b2.getSum());
		
		BBB b3 = new BBB(5, 6);
		System.out.printf("%d + %d = %d\n", b3.getAbc(), b3.getB(), b3.getSum());
	}	
}


/*
 * static	stack	heap
 * Type		변수	 =	값
 * BBB		b1	 = new BBB(); 
 */

/*
 * class : 설계도
 * instance : 실제 물건(객체), class를 갖고 메모리에 구현된 구현체
 * member : class가 가진 것
 * method : 기능
 * constructor : 생성자
 */
