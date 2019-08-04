package com.test01;

import java.util.Arrays;

// 문자열은 char[] - 문자형의 배열, 문자형은 값 자체인 반면에 문자열은 주소 값이다.
// 한번 생성된 문자열은 CRUD(Create, Read, Update, Delete) 불가능. +immutable (대입하기 전에는 값이 변하지 않는다.)
// -> 새로운 객체를 생성해서 값을 변화시킨다. (값을 변경시켜도 해시코드는 바뀌지 않는다)
// heep 영역에 있는 string pool에 리터럴 생성

// StringBuffer / StringBuilder : Buffer는 스레드에 안전하고 Builder는 안전하지 못함.

/*
 * String a = "abc";
 * String b = "abc";
 * String c = new String("abc"); = new String객체에 새로 만들어진다
 * 
 * System.out.print(a==b); 	// true 값 자체기 때문에 같다.
 * System.out.print(a==c);	// false 주소 값이 다르다.
 * 
 * 	a==b //true	-> 주소 비교
 * 	a==c //false
 * 	a.equals(b) //true	-> 값 비교
 * 	b.equals(c) //true
 */
public class MTest {
	
	static String str = "The String class represents character strings."; // class 변수
	
	public static void main(String[] args) {	// instance 변수
		String s = "Hello";
		s = 1+2+s;		// 3Hello
		System.out.println(s);
		
		s = s+1+2;		// 3Hello12
		System.out.println(s);
		//String Concatenation
		
		Prn01();
		Prn02();
		Prn03();
		Prn04();
		Prn05();
		Prn06();
		Prn07();
		Prn08();
		Prn09();
		Prn10();	
		
	}
	public static void Prn01() {
		// 1. str의 길이를 출력하라.
		System.out.println("str의 길이는 "+str.length()+"입니다.");
	}
	
	public static void Prn02() {
		// 2. str 전체 대문자로 출력하라.
		System.out.println("대문자 전체 출력: "+str.toUpperCase());		
	}
	
	public static void Prn03() {
		// 3. str 전체 소문자로 출력하라.
		System.out.println("소문자 전체 출력: "+str.toLowerCase());		
	}
	
	public static void Prn04() {
		// 4. str에서 첫번째 c의 인덱스를 출력하라.
		System.out.println("str에서 첫번째 c의 인덱스는 "+str.indexOf('c')+"입니다.");		
	}
	
	public static void Prn05() {
		// 5. 'class'를 'java'로 출력하라.
		System.out.println("class를 java로 변경하여 출력하면 "+str.replaceAll("class", "java")+"로 출력됩니다.");		
		// replace는 새로운 값(리터럴)을 만드는 것, 겉으로는 변경된거처럼 보이지만 실제로는 ~class~는 남아있고 ~java~로 하나 더만들어진후 그것이 출력된다.
	}
	
	public static void Prn06() {
		// 6. character를 찾아서 대문자로 변환한 후 전체 출력		
		String target = "character";
		
		// character 라는 단어의 시작 인덱스
		int start = str.indexOf(target);
		// character 라는 단어의 끝 인덱스
		int end = start + target.length();
		
		//character라는 단어를 잘라와서 대문자로 변환
		String upper = str.substring(start,end).toUpperCase();
		
		System.out.println("character를 대문자로 변경하여 출력하면 "+str.replace(target, upper)+"입니다.");
		
	}
	public static void Prn07() {
		// 7. str을 char[]로 출력하되 c만 출력하자. + c의 갯수 함께 출력.
		char [] c = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(c[i]=='c'||c[i]=='C')
				count++;
			System.out.print(c[i]);
		}
		System.out.print("c만 출력하면: ");
		for(int i = 0; i<str.length(); i++) {
			if(c[i]=='c'||c[i]=='C')
				System.out.print(c[i]);
		}
		
		System.out.printf("\tc의 갯수는 %d개 입니다.", count);
		System.out.println();
		
		
		
	}
	public static void Prn08() {
		// 8. str을 char[]로 출력하되, 대문자만 출력하자. + 대문자의 갯수를 함께 출력.
		char [] c = str.toCharArray();
		
		System.out.print("대문자만 출력: ");
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			for(int j = 'A'; j <= 'Z'; j++) {
				if(c[i]==j) {				
					System.out.print(c[i]);
					count++;
				}				
			}
		}System.out.println("\n대문자의 갯수는 :"+count);
		
	}
	public static void Prn09() {
		// 9. 공백 제거 후 출력.
		String str = "	The String class represents character strings.	";	//앞과 뒤의 공백만 지워짐.
		str = str.trim();
		System.out.println(str);
		System.out.println(str.replace(" ", ""));	//이렇게 해주면 공백 삭제
	}
	public static void Prn10() {
		// 10. 전체 역순으로 출력.
		char[] c = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			
			for(int j=0; j<str.length(); j++) {
				
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
			}	
			System.out.print(c[i]);
		}
	}
		/*int arrIndex =0;
		char[] ch = new char[str.length()];
		for(int i= str.length(); i>0; i--) {
			ch[i-1] = str.charAt(arrIndex);
			arrIndex++;
		}
			System.out.println(Arrays.toString(ch));

	}*/

}
