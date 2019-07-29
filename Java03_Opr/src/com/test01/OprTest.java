package com.test01;

// Operator : 연산자
public class OprTest {
	//전역 변수
	
	//상수(변수 앞에 final 선언)
	public static final int TEN = 10;
	
	public static void main(String[] args) {
		//지역변수		
		System.out.println(op01(TEN,3 ));
		System.out.println(op02());
		op03(TEN, 3);	// return이 void라서 print로 출력하면 출력하는 값이 없다.
		op04();			// return이 void라서 print로 출력하면 출력하는 값이 없다.
		System.out.println("op05 : " + op05());
		op06();
		op07();
	}
			
	// 1. 사칙연산
	public static String op01(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b , a+b);
		System.out.printf("%d - %d = %d\n", a, b , a-b);
		System.out.printf("%d * %d = %d\n", a, b , a*b);
		System.out.printf("%d / %d = 몫: %d \t나머지 : %d\n", a, b , a/b, a%b);

		return "사칙 연산 끝!\n";
	}
	
	// 2. 대입연산( +=, -=, *=, /=)
	public static String op02() {
		System.out.println("=========================");
		
		int i = 15;
		System.out.println("i : "  + i); //15
		
		i = i + 10;
		System.out.println("i : " + i);	//25
		
		i += 10;
		System.out.println("i : " + i);	//35

		i -= 10;
		System.out.println("i : " +i); 	//25
		

		return "=========================";
	}
	
	// 3. 증감 연산자( ++, --)
	// 변수의 앞 뒤에 증가/감소 연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/감소하게 된다.
	// 전위 연산자 : 연산자를 변수에 앞에 붙여서, 연산을 먼저하고 값을 나중에 리턴한다.
	// 후위 연산자 : 연산자를 변수 뒤에 붙여서, 값을 먼저 리턴하고 연산을 나중에 한다.
	
	public static void op03(int a, int b) {
		System.out.println(a);	//10 (main에서 변수 TEN(10), 3 으로 지정)
		System.out.println(a++);	//10 (후위연산자라 출력은 10, a에 저장된 값은  11)
		System.out.println(++a);	//12 (저장된 a값 11에서 1을 더한 전위연산자, 12출력)
		
		int res = a++ + ++a + --b + --a;
		//		12(13) 14(14) 2(2) 13(13) = 41 -> 앞의 수가 출력, 뒤의 수가 실제 저장된 값
		System.out.println(res);		
	}
	
	// 4. 논리 연산자( &&, ||: true, false)
	public static void op04() {
		//조건 연산자 형태
		System.out.println("=========================");
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(false & true);	//false
		System.out.println(false & false);	//false
		
		System.out.println(true | true);	//true
		System.out.println(true | false);	//true
		System.out.println(false | true);	//true
		System.out.println(false | false);	//false
		System.out.println("=========================");
		
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false	-> 앞에 조건이 false이므로 뒤에 값과 관계없이 false출력
		System.out.println(false && false);	//false -> Dead code
		
		System.out.println(true || true);	//true -> 앞에 조건이 true이므로 뒤에 값과 관계없이 true출력
		System.out.println(true || false);	//true -> Dead code
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		int a = 2;
		int b = 3;
		
		System.out.println((a>b) && (a<b));	//false
		System.out.println("=========================");
	}
	
	// 5. 비교연산자
	public static boolean op05() {
		// == : 같다
		System.out.println(true == false);	//false
		// != : 같지 않다
		return (true != false);	//true
			
	}
	
	// 6. 삼항 연산자 -> (조건)?참:거짓
	public static void op06() {
		System.out.println("=========================");
		int a = 2;
		int b = TEN;
		int i = (a>b)?a-b:b-a;
		System.out.println(i);		
		
		String res = (a<b)?"b가 더 크다." : "a가 더 크다.";
		System.out.println(res);
		System.out.println("=========================");		
	}

	// 7. 비트연산자( &, |, ^, ~, <<, >>) : 수치를 0, 1 비슽 상태에서 연산
	public static void op07() {
		
		int a = 10;
//		0000 0000 0000 0000 0000 0000 0000 1010;		
		int b = 2;
//		0000 0000 0000 0000 0000 0000 0000 0010;		
		
		System.out.println(a & b);
//		0000 0000 0000 0000 0000 0000 0000 1010;
//		0000 0000 0000 0000 0000 0000 0000 0010; (&)
//		----------------------------------------
//		0000 0000 0000 0000 0000 0000 0000 0010; //2
		
		System.out.println(a | b);
//		0000 0000 0000 0000 0000 0000 0000 1010;
//		0000 0000 0000 0000 0000 0000 0000 0010; (|)
//		----------------------------------------
//		0000 0000 0000 0000 0000 0000 0000 1010; //10
		System.out.println("=========================");
		
		int c = 10;
//		0000 0000 0000 0000 0000 0000 0000 1010;
		System.out.println(Integer.toBinaryString(c >> 2)+ " = 2(2진수 10 이다.)");
//		00 0000 0000 0000 0000 0000 0000 0000 10; //2		
		
		System.out.println(Integer.toBinaryString(c << 4)+ " = 2(2진수 10 이다.)");
//		0000 0000 0000 0000 0000 0000 0000 1010 0000; //160 
		System.out.println((c << 4)+ " = 10진수 수이다.");
		
	}
	
	
}










