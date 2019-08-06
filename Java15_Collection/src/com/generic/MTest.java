package com.generic;

public class MTest {
	
	// generic : type 강제 !!
	public static void main(String[] args) {
		
		Emp<String> e1 = new Emp<String>("e1111", "홍길동");	// empno<T>에는 어떤 타입도 들어 갈 수 있다. 
		Emp<Integer> e2 = new Emp<Integer>();				// generic은 타입 강제 !! (Collection에는 여러 형태가 들어가 원치 않는 값이 
															// 들어갈 수 있기 때문에 generic을 이용하여 타입을 강제한다.
		e2.setEmpno(2222);
		e2.setEname("김선달");
		
		System.out.println(e1.getEname()+" : "+e1.getEmpno());
		System.out.println(e2.getEname()+" : "+e2.getEmpno());
		
		
	}

}
