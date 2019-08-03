package com.test01;

public class ArgsTest {
	
	// 프로젝트 우클릭-> run as -> run configureation -> arguments -> program arguments(variables) -> string_prompt-> $[string_prompt] 출력 -> 아무거나 공백추가해서 입력하면 출력된다.
	// 공백을 기준으로 arguments들이 배열로 들어간다.
	public static void main(String[] args) {
		String s = args[0];
		System.out.println(s);
		
		System.out.println("=================");

		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
