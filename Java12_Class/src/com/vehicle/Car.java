package com.vehicle;

public class Car {
	
	private String color;
	private int speed;
	
	public Car() {
		this.color = "black";	// default 값을 설정해주는 용도로 사용하기도 한다.
	}
	public Car(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;		
	}
	
	public void accelPedal() {
		System.out.println("속도가 올라갑니다.");
		speed += 10;
	}
	public void breakPedal() {
		System.out.println("속도가 줄어듭니다.");
		speed -=10;
		if(speed<=0) {
			speed = 0;
			System.out.println("멈췄습니다.");
		}
	}
	@Override
	public String toString() {
		return "현재속도는 "+speed+" 입니다.";
		
	}

}
