package com.test03;

public class MTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		cat.eat("생선");
		dog.bark();
		dog.eat("뼈다귀");
		
	}

}
