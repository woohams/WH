package com.test02;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		stringTest();
		stringBufferTest();
		
	}
	
	public static void stringTest() {
		String s = "안녕하세요. ";
		s += "저는 ";
		s += "홍길동 입니다. ";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		s.replace("안녕하세요. ", "하위~ ");	
		System.out.println(s);	//값을 대입시켜준게 아니기때문에 바뀌지 않는다.
		
		s = s.replace("안녕하세요. ", "하위~ ");	
		System.out.println(s);
		System.out.println(s.hashCode());	// 대입 시켜주었기 때문에 값과 해쉬코드 역시 변한다.
											// 안녕하세요. ~~~는 여전히 어딘가에 존재하며     	하위~ ~~~를 새로 만들어주는 형식이다
	}
	
	public static void stringBufferTest() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("안녕하세요. ")
		.append("저는 ")
		.append("홍길동 입니다.");	//return 값이 string이므로 .append 를 이용하여 연결시켜 사용할 수 있다.
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		// muteable
		sb.replace(0, 6, "하위~");
		System.out.println(sb);
		System.out.println(sb.hashCode());	//hashcode는 변하지 않고 같다.(값만 변하고 주소는 변하지 않는것을 확인할 수 있다.)
		
		sb.reverse();
		System.out.println(sb);
	}

}
