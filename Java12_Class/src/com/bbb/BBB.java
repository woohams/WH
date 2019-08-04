package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA {
	
	private int b;
	
	public BBB() {
		super();	//super(); -> 부모생성자 (지우면 부모의 기본 생성자를 호출해온다.)
		System.out.println("BBB 생성");
	}
	public BBB(int b) {
		super(b);
		this.b = b;
		System.out.println("BBB 생성(b 받아서 생성)");
	}

	public BBB(int abc, int b) {
		super.setAbc(abc);	//super.setAbc(abc) -> 부모객체, super지워도 사용가능
		this.b = b;
		System.out.println("BBB 생성(abc, b 받아서 생성)");
	}
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		//super : 부모
		//this : 나(자신)
		
		int sum = super.getAbc() + this.getB();	//super 와 this 를 지워도 불러올수 있다.
				//this.getAbc()로도 사용할 수 있다. -> 이미 상속 받았기 때문에
		
		return sum;
	}
	
	@Override	// 재정의 : 상위 클래스를 재정의 시켜 원하는대로 사용, @Override는 안써도 사용 가능
	public void prn() {
		System.out.println("BB.prn()");
	}
	
}




