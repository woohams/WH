package com.test02;

public class MyCalcMain {

	
	public static void main(String[] args) {
		
		// 숫자 10과 3을 MyCalc라는 클래스의 sum 이라는 메소드를 호출하자
		
		//메소드 외부에서 메소드에 전달되는 "값"; = 아규먼트(argument)
		MyCalc.sum(10, 3);
		
		// sub 호출해서 결과 출력(10, 3)
		int res = MyCalc.sub(10, 3);	//type 변수 = 값,  MyCalc.sub(10, 3);에 7이 return 되어서 int형으로 저장되어 있다.(값)
		System.out.println(res);
		
		// mul 호출해서 결과 출력(10, 3)
		double res1 = MyCalc.mul(10, 3);
		System.out.println(res1);
		
		// div 호출해서 결과 출력(10, 3)
		MyCalc.div(10, 3);
		
		MyCalc.multi(10.5, 3.8);
	}
}
