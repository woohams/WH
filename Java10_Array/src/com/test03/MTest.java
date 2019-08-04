package com.test03;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person();
		p01.name = "홍길동";
		p01.age = 100;
		
		Person p02 = new Person();
		p02.name = "김선달";
		p02.age = 150;

		// 객체 배열
		Person[] people = new Person[] {p01, p02};

		// 문제 - 다음과 같이 출력하시오.
		// 홍길동(100세)
		// 김선달(150세)
		
		for(int i =0; i<people.length; i++) {
			System.out.printf("%s(%d세)\n",people[i].name, people[i].age);
		}
	}

}











