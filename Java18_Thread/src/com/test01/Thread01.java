package com.test01;

// 쓰레드 만들기 방법 1 : 간단하게 Runnable을 implements 한다. 쓰레드 변수 = 뉴 쓰레드
class MyThread implements Runnable{
	
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("i:"+i);
		}
	}
}
//싱글 쓰레드 : 메인메소드 실행 후 순서대로 출력
//멀티 쓰레드 : 메인 메서드 실행
public class Thread01 {
	
	public static void main(String[] args) {
		
		System.out.println("main-----------------");
		/*
		// thread가 아니다.
		MyThread m01 = new MyThread();
		MyThread m02 = new MyThread();
		m01.run();
		m02.run();
		*/
		
		Thread m01 = new Thread(new MyThread());	// 생성자에 객체를 아규먼트 값으로 넣어줘야 쓰레드화 된다.
		Thread m02 = new Thread(new MyThread());
		
		// start() 메소드는 자동으로 run()을 호출!
		m01.start();
		m02.start();
		
		
		System.out.println("main=================");
	}

}
