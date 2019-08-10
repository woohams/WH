package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class URI01 {
	
	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI("http://localhost:8787/Java19_URI_WEB/res.jsp?tname=%EC%82%AC%EB%9E%8C%EC%95%84%EB%8B%98&taddr=%EC%97%AC%EA%B8%B0%EC%95%88%EC%82%BC");
		
		System.out.println(u.getScheme());	// http 통신규약
		System.out.println(u.getHost());	// localhost
		System.out.println(u.getPort());	// 8787 포트넘버
		System.out.println(u.getPath());	// Java19_URI_WEB/res.jsp 파일 경로, 파일이름
		System.out.println(u.getQuery());	// queryString (이름&주소)
		
		// URI (Uniform Resource Identifier) : 자원 식별자
		// URL (Uniform Resource Locator) : 자원 위치
		// URN (Uniform Resource Name) : 자원 이름
		// URI = URL + URN
	}

}
