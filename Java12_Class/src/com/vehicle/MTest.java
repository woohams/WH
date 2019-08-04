package com.vehicle;

public class MTest {
	public static void main(String[] args) {
		Car c1 = new SportsCar();
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1);
		c1.breakPedal();
		System.out.println(c1);
		c1.breakPedal();
		System.out.println(c1);
		System.out.println(c1);	// - 출력이 되는지 안되는지 확인
		c1.breakPedal();		// 멈췄습니다
	}

}
