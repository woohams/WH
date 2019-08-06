package com.test01;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.bark();
		dog.bark();
		cat.eat("생선");
		dog.eat("고기");
		
		// Animal a = new Animal(); 	-추상 class는 new를 사용하여 만들수 없다.(=객체를 만들수 없다)
		//							why?? a.bark를 하면 bark가 비어있기 때문에 컴퓨터가 인식할수 없어서 애초에 new를 사용 못하게 함
	}

}
