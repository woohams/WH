package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {
	
	public static void main(String[] args) {
		
		MethodTest01.publicMethod();	// import com.test01.MethodTest01; 를 이용해 다른 패키지의 메서드 가져오기
		// MethodTest01.protectedMethod(); 	-> protected는 같은 패키지에서 참조 가능(상속이 아닐시에)
		//									-> 다른 패키지이므로 참조 불가능
		
	}

}
