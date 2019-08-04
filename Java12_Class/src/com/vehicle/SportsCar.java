package com.vehicle;

public class SportsCar extends Car {
	
	public SportsCar() {
		System.out.println(getColor()+"sport car 생성");
	}
	public SportsCar(String color) {
		super(color);
		System.out.println(getColor()+"sports car 생성");
	}
	
	@Override
	public void accelPedal() {
		// 속도가 더 빨리 올라갑니다.
		// +20
		System.out.println("속도가 더 빨리 올라갑니다.");
		setSpeed(getSpeed() + 20);
	}
	@Override
	public void breakPedal() {
		// 속도가 더 빨리 줄어듭니다.
		// -20
		System.out.println("속도가 더 빨리 줄어듭니다.");
		setSpeed(getSpeed() - 20);
			if(getSpeed()<0) {
				System.out.println("멈췄습니다.");
				setSpeed(0);
			}
		}
		

	public String toString() {
		return "sports car의 "+super.toString();
	}
}
