package com.fruit;

public class FruitMain {
	
	public static void main(String[] args) {
		FruitBasket banana = new FruitBasket(); //non-static 호출 방법 :
		banana.basketSetting("바나나" , 10);		//class 변수 = new class()
		
		System.out.println(banana.fruitName);
		System.out.println(banana.fruitCount += 10);
		System.out.println(banana.size += 20);
		//System.out.println(FruitBasket.fruitName); static 오류
		
		FruitBasket apple = new FruitBasket(); 
		banana.basketSetting("사과" , 21);
		
		System.out.println(apple.fruitName);
		System.out.println(apple.fruitCount);
		System.out.println(apple.size);
	}

}
