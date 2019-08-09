package com.test01;

// 쓰레드 만들기 방법 2 : 여러가지 기능을 사용하기 위해 Thread를 extends해야 한다. 그냥 객체 생성해주면 된다.
class MyThread02 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("i:"+i);
		}
	}
}

public class Thread02 {

	public static void main(String[] args) {
		
		System.out.println("main------------------");
		
		MyThread02 m01 = new MyThread02();	// 멀티쓰레드 : 우선순위를 따로 정해놓지 않으면 시스템에서 각각의 우선순위에 따라 알아서 지정하기 때문에 
		MyThread02 m02 = new MyThread02();	// 			출력할때마다 순서가 달라진다.
		
		m01.start();
		m02.start();
		
		System.out.println("main==================");
		
	}
	
	
}
