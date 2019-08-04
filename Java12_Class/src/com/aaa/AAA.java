package com.aaa;

// public class AAA (extends Object)
public class AAA {
	
	private int abc;	// field
	
	// 기본 생성자
	public AAA() {
		System.out.println("AAA 생성");
	}
	
	// 생성자 (int형 파라미터 하나 받는)
	public AAA(int abc) {
		//super();
		System.out.println("AAA 생성(abc 받아서 생성)");
		this.abc = abc;		// field 초기화 (생성자의 목적: 객체 생성, field 초기화)
	}
	
	// getter & setter (getter - field에 있는 값을 리턴, setter - 값을 받아 field를 초기화)
	// method
	public void setAbc(int abc) {
		this.abc = abc;	
	}
	public int getAbc() {	// field에 있는 값을 가져옴
		return abc;
	}
	public void prn() {
		System.out.println("AAA의 prn 메소드");
	}

}

/*
  <생성자>
  	1. 클래스 이름과 동일하되 리턴타입은 없고 객체 생성시 접근제한자는 public
  
  class Test{
  	public Test(){	// 생성자 (static, return type x)
  	}
  }
 
 	2. 생성자는 객체 생성을 하는 new 연산자와 함께 사용되며 
 	       생성시 단 한번만 자동 호출된다.
 	Test t1 = new Test();	// 객체를 생성해 주는 것 -> 생성자
 	
 	3. 메서드 처럼 객체 및 클래스 명으로 호출할 수 없다.
 	
 t1.Test() // X
 
 	4. Overload 할 수 있다.
 	
 class Test{
 	
 	public Test() {}			// default constructor
 	public Test(parameter p) {}
 	public Test(parameter p1, parameter p2, ...) {}
 
 	5. 생성자를 명시하지 않으면 기본 생성자가 제공되어 맴버변수를 초기화하고,
 	명시된 생성자를 선언하게 되면 명시 생성자만 호출되고,
 	기본 생성자는 제공되지 않는다.
 class AA{				//new AA();
 }
 
 class BB{				//new BB();
 	public BB(){}		// 기본 생성자 호출 가능
 }
 
 class CC{				//new CC() X -> NEW CC(10)
 	public CC(int a){}	// 기본 생성자에 파라미터가 하나라도 들어있으면 아규먼트 값을 넣어줘야 호출 할 수 있다.
 }
 	
 	6. 생성자는 상속되지 않는다.
 	
 	7. 생성자는 내부 호출 할 수 있으며, 키워드는 this()로 사용한다.	// this() - dafault, this(10) - 파라미터 하나짜리.
 	
 	8. 생성자의 목적은 맴버변수 초기화, 객체 생성에 있다.	// class에서 member는 변수와 메소드
 				(field)
 */
