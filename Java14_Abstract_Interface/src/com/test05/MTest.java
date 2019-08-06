package com.test05;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV ig = new IgTV();
		TV samsong = new SamsongTV();
		
		System.out.println(ig.volumeUp());
		System.out.println(ig.volumeUp());
		System.out.println(ig.volumeUp());
		System.out.println(ig.volumeDown());
		System.out.println(ig.volumeDown());
		System.out.println(ig.volumeDown());
		
		System.out.println(samsong.volumeUp());
		System.out.println(samsong.volumeUp());
		System.out.println(samsong.volumeUp());
		System.out.println(samsong.volumeDown());
		System.out.println(samsong.volumeDown());
		System.out.println(samsong.volumeDown());
		

	}

}
