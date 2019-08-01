package com.test02;

public class Breaktest {
	
	public static void main(String[] args) {
		
		prn01();
		
	}

	private static void prn01() {
		
		/*char ch = 'A';
		
		while(ch <= 'Z'){
			System.out.print(ch + " ");
			
		if(ch % 5 == 4) {
			System.out.println();
			}
		ch++;
		}*/
		
		char c = 'A';
		int count = 0;
		boolean stop = true;
		
		while(stop) {
			while(true) {
				System.out.print(c+ " ");
				c++;
				count++;
				
				if(count % 5 == 0) {
					break;
				}
				if(count == 26) {
					stop = false;
					break;
				}
			}
			System.out.println();
		}
	}
		
}
	
	/*
	 * A B C D E
	 * F G H I J
	 * K L M N O
	 * P Q R S T
	 * U V W X Y
	 * Z
	 */


