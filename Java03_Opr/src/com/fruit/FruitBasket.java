package com.fruit;

// FruitMain (FruitBasket 클래스와 같은 패키지)
// 1. diagram을 보고 FruitBasket 클래스를 작성하라. (size = 20, fruitCount = 5로 각각 초기화)

// 2. basketSetting 메소드는 
// 과일의 이름과 과일의 갯수를 받아서 
// fruitName 변수에 이름을 "대입"하고
// fruitCount 변수에 과일의 갯수를 "추가"하는 기능을 한다.
// 또한, basketPrn 메소드를 호출한다.

// 3. basketPrn 메소드에서는
// "바구니 안의 과일 이름 : <과일이름>"를 출력하고
// 삼항연산자를 사용하여 리턴받은 결과를 출력하라.
// 삼항연산자의 조건 : size가 fruitCount 변수보다 크거나 같다.
// 참일때 명령 : "<과일이름>의 갯수는 <과일갯수> 입니다."
// 거짓일 때 명령 : "바구니가 넘쳤습니다."

// 4. FruitMain 클래스의 main 메소드에서
// 4-1.바나나, 10개를 basketSetting 메소드의 아규먼트로 사용하여 호출
// 4-2.사과, 21개를 basketSetting 메소드의 아규먼트로 사용하여 호출

public class FruitBasket {
	
	//field (전역변수)
	static int size = 20;	//class variable(static)
	int fruitCount = 5;		//instance variable(non-static)
	String fruitName;
		
	public void basketSetting(String name, int fruit) {
		
		fruitName = name;
		fruitCount += fruit;
		
		basketPrn();
		
	}
	

	private void basketPrn() {
		System.out.println("바구니 안의 과일 이름 :  " + fruitName);
		String res = (size >= fruitCount)?fruitName + "의 갯수는 " + fruitCount + "개 입니다." : "바구니가 넘쳤습니다.";
		System.out.println(res);

	}
			
}
