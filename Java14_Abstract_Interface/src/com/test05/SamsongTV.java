package com.test05;

public class SamsongTV implements TV {

	int volume =0;
	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		
		volume +=2;
		return volume;
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		
		volume -=2;
		
		return volume;
	}

}
