package com.test01;

public class Thread04 {
	
	public static void main(String[] args) {
		
		MyThread03 m01 = new MyThread03("멍멍");
		MyThread03 m02 = new MyThread03("야옹");
		
		long start_time = System.currentTimeMillis();
		m01.start();
		try {
			m01.join();
			// m01 thread가 종료될 때 까지 다른 thread 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m02.start();
		long end_time = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (end_time-start_time));
		
	}

}
