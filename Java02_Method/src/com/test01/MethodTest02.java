package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		
		//method 호출 방법
		
		// 1. static method
		// class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		// MethodTest01.privateMethod(); 
		// -> private 접근제한자는 같은 클래스 내부 에서만 접근, 참조 가능하기 때문에 Error

		// 2. non static method
		// class 변수 = new class(); (참조 타입 = 오브젝트 값을 상속 받는 모든 클래스)
		// 변수.method();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		
		// method01.publicMethod();
		// static에서 non static을 호출(x)
		// non static에서 static을 호출 (o) -> 안쓰는게 좋다.
		
		// http://www.objectaid.com
		// uml : Unified Modeling Language
		// help -> install new software  -> name : ObjectAid UML Explorer 
		//									URL : http://www.objectaid.com/update/current
		//									-> 박스 체크 후 설치
	}

}
