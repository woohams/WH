package com.bomb;

public class Bomb {
	
	private int n;
	
	public Bomb() {
		this.n = 10;
	}
	public void getnN(int n) {
		this.n = n;
		
	}
	

	public int Bomb(int n) {
		this.n = n;
		if(n<=10) {
		for(int i=1;i<=n;i++) {
			System.out.println();
			for(int j=1;j<=n;j++) {
				System.out.print(0+" ");
				}
			}
		}return n;
	}
	
	
}




