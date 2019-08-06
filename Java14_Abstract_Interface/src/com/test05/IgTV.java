package com.test05;

public class IgTV implements TV {
	int volume =0;

	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		
		volume +=1;
		
		return volume;
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub

		volume -=1;
		
		return volume;
	}

}
