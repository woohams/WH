package com.test02;

import java.util.Scanner;

public class aa {
public static void main(String[] args) {
		
		int dice = 0;
		int player = 1;
		boolean start = true;
		
		System.out.println("시작!");
		player(player);
		
		while(start) {
			System.out.println("주사위를 던져주세요 (아무거나 입력)");
			Scanner sc = new Scanner(System.in);
			sc.hasNext();
			dice = (int)(Math.random()*6)+1;			
			
			if(dice >= 3) {
				player += 1;
				System.out.println(dice + " 나왔습니다. 한칸 전진");
				player(player);				
			} if (player == 10) {
				start = false;			
			}
			
			if(dice <= 2) {
				player -= 1;						
				if(player <= 0) {
					player = 1;
					System.out.println(dice + " 나왔습니다. 한칸 후퇴 더이상 뒤로 갈수 없습니다.");
					player(player);					
				}else{				
					System.out.println(dice + " 나왔습니다. 한칸 후퇴");
					player(player);
				}		
			
			}
			
		}
		
		System.out.println("도착했습니다!!!");
		
	


}
	

	private static void player(int player) {

		for (int i = 1; i <= 9; i++){			
			if(i == player) {
				System.out.print("0");
				}
			System.out.print("-");
			}
		
		if(player == 10) {			
			System.out.print("0");	
			}
		
		System.out.println();
	}




}
