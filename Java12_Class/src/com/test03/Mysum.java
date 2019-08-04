package com.test03;

// 메소드 오버로딩
public class Mysum {
	public int sum(int i) {
		return i+i;
	}	
	public int sum(int i, int j) {
		return i+j;
	}
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	public double sum(double d1, double d2) {
		return d1+d2;
	}	// 파라미터가 다르기때문에 메소드 이름이 같아도 된다. = 같은 이름이지만 다른 동작을 한다.

}
