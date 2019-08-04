package com.test02;

public class MTest {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.bark();
		
		animal = new Dog();
		animal.bark();
		
		if(animal instanceof Dog) {
			System.out.println("멍멍이");
		}else if(animal instanceof Cat) {
			System.out.println("고양이");
		}

	}

}

/*
  
 1. 부모의 타입으로 자식 생성 가능
 Parent p = new Child();
 
 2. 부모의 이름으로 자식 대입
 Child c = new Child();
 Parent p = c;
 
 3. 부모의 메소드를 통해 자식의 메소를 호출
 Parent p = new Child();
 p.method();
 
 ※ 같은 부모를 갖고 있는 자식 클래스는 컴파일시 형 변환이 가능하지만
  실행시(runtime)에 ClassCastException을 발생!
  
  Animal a = new Cat();
  Dog d = (Dog)a; -> a에는 Cat이 들어있기 때문에 실행(runtime)은 안되지만 컴파일에서는 형 변환이 가능하다.

*/
