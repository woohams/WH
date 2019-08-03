package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() {
		System.out.println("돈을 넣어 주세요\n(1잔당 400원)");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("커피의 잔 수를 입력해 주세요.");
		int jan = sc.nextInt();
		
		if(jan * 400 <= money) {
			makeCoffee(money, jan);
			
		}else {
			System.out.println("금액이 "+(jan*400 - money)+"원 부족합니다.");	
		}
	}

	private void makeCoffee(int money, int jan) {

		int change = money - (jan*400);
		/*if(change >= 0) {
			System.out.println("커피 "+jan+"잔 나왔습니다.");
			System.out.println("잔돈은 "+change+"원 입니다.");
		}*/
		
		
		System.out.println("커피 "+jan+"잔 나왔습니다.");
		System.out.println("잔돈은 "+change+"원 입니다.");
	}
}
