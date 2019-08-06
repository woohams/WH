package com.test04;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.bark();
		cat.eat("생선");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");
		dog.bite();	//Animal로 쓰면 Animal에는 bite가 없기때문에 Dog로 해줘야함.
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("고기");
		eagle.fly();	// bite와 마찬가지로 Eagle로 해줘야 fly() 가능

	}

}
