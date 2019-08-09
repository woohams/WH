package com.test01;

class MyThread03 extends Thread{
	public MyThread03(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i =0; i<1000; i++) {
			System.out.println(this.getName()+":"+i);
		}
		System.out.println("-----------"+this.getName()+"끝---------");
	}
}



public class Thread03 {
	
	public static void main(String[] args) {
		
		MyThread03 m01 = new MyThread03("멍멍");
		MyThread03 m02 = new MyThread03("야옹");
		
		m01.setPriority(10);
		m02.setPriority(Thread.MIN_PRIORITY);
		
		m01.start();
		m02.start();
		
		// Priority : 우선순위
		// Java Thread의 Scheduling은 우선순위(Priority)와 순환할당(Round-robin)방식을 사용한다.
		System.out.println(m01.getName()+">"+m01.getPriority());	//메인 쓰레디 우선선위 ↑↑
		System.out.println(m02.getName()+">"+m02.getPriority());
	}

}
