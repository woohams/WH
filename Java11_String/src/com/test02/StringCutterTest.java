package com.test02;

import java.util.StringTokenizer;

public class StringCutterTest {

	public static void main(String[] args) {

		String str = "The String class represents character strings.";

		// java.lang.String.substr
		System.out.println(str.substring(4));		//String class represents character strings.
		System.out.println(str.substring(4, 10));	//String
		
		// java.lang.String.split
		String str02 = "The,String,class";
		String[] temp = str02.split(",");	//,을 기준으로 문자를 짤라서 배열에 저장해준다.
		
		
		for(int i=0; i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		// java.util.StringTokenizer
		String str03 = "represents_character_strings.";
		
		StringTokenizer st = new StringTokenizer(str03,"_");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());	// st.hasMoreElements()에서 다음것이 있으면 가져온다.
		}
		
	}
	

}










