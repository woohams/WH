package com.test02;

import java.util.Scanner;

public class aa {
public static void main(String[] args) {
		
		int dice = 0;
		int player = 1;
		boolean start = true;
		
		System.out.println("����!");
		player(player);
		
		while(start) {
			System.out.println("�ֻ����� �����ּ��� (�ƹ��ų� �Է�)");
			Scanner sc = new Scanner(System.in);
			sc.hasNext();
			dice = (int)(Math.random()*6)+1;			
			
			if(dice >= 3) {
				player += 1;
				System.out.println(dice + " ���Խ��ϴ�. ��ĭ ����");
				player(player);				
			} if (player == 10) {
				start = false;			
			}
			
			if(dice <= 2) {
				player -= 1;						
				if(player <= 0) {
					player = 1;
					System.out.println(dice + " ���Խ��ϴ�. ��ĭ ���� ���̻� �ڷ� ���� �����ϴ�.");
					player(player);					
				}else{				
					System.out.println(dice + " ���Խ��ϴ�. ��ĭ ����");
					player(player);
				}		
			
			}
			
		}
		
		System.out.println("�����߽��ϴ�!!!");
		
	


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
