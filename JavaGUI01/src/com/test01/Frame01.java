package com.test01;

import java.awt.Button;
import java.awt.Frame;

/*
 * awt에서 한글 encoding이 깨질 때...
 * 
 * run configration -> Argument tab -> vm arguments에 다음 명령 저장
 * -Dfile.encoding=MS949
 * 
 * 
 */


// 순서는 자기가 편한대로...
// 0. 필드 component 선언
// 1. 생성자에서 필드 초기화(객체 생성)
// 2. 패널에 객체들을 올린다.
// 3. 프레임에 패널을 올린다.
// 4. 이벤트를 연결한다.

public class Frame01 extends Frame {
	
	Button btn;	// 전역변수
	
	public Frame01() {
		btn = new Button("Click me!");	// 필드 초기화
	}
	
	public void go() {
		add(btn);	// this. 생략 -> this는 Frame
		
		setSize(500, 500);	// this. 생략 
		setVisible(true);	// this. 생략
	}
	
	public static void main(String[] args) {
		Frame01 f = new Frame01();
		f.go();
	}

}
