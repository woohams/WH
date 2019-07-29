package com.test01;

public class MethodTest01 {
	
	//프로그램의 주 진입점
	public static void main(String[] args) {
		
		// 접근제한자 메모리영역 리턴타입 이름(파라미터) {
		//	명령들 ...; }
		
		//접근제한자 : 접근을(참조) 제어
		// public
		// protected
		// (default)
		// private
		
		// static 메소드는 class.method() 로 호출(사용, 실행) 가능하다.
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();
		privateMethod();
		 
	}
	
	// 메소드 안에 또 다른 메소드는 들어갈 수 없으므로 여기서 선언
	public static void publicMethod() {
		System.out.println("public method 입니다.");
		System.out.println("어디서나 접근, 참조 가능합니다.(+)");
	}
	
	protected static void protectedMethod() {
		System.out.println("protected method 입니다.");
		System.out.println("상속일 경우, 상속된 곳에서");
		System.out.println("상속이 아닐 경우, 같은 패키지 내에서만");
		System.out.println("접근, 참조 가능합니다.(#)");
	}
	
	static void defaultMethod() {
		// default는 작성하지 않는다.
		System.out.println("(default) method 입니다.");
		System.out.println("같은 패키지 내에서만 접근, 참조 가능합니다.(~)");
	}
	
	private static void privateMethod() {
		System.out.println("private method 입니다.");
		System.out.println("현재 클래스 내에서만 접근, 참조 가능합니다.(-)");
	}
	
	public void nonStaticMethod() {
		System.out.println("non static method 입니다.");
		System.out.println("객체 생성을 해야 사용할 수 있습니다.");
	}

}
