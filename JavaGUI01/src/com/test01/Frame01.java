package com.test01;

import java.awt.Button;
import java.awt.Frame;

/*
 * awt���� �ѱ� encoding�� ���� ��...
 * 
 * run configration -> Argument tab -> vm arguments�� ���� ��� ����
 * -Dfile.encoding=MS949
 * 
 * 
 */


// ������ �ڱⰡ ���Ѵ��...
// 0. �ʵ� component ����
// 1. �����ڿ��� �ʵ� �ʱ�ȭ(��ü ����)
// 2. �гο� ��ü���� �ø���.
// 3. �����ӿ� �г��� �ø���.
// 4. �̺�Ʈ�� �����Ѵ�.

public class Frame01 extends Frame {
	
	Button btn;	// ��������
	
	public Frame01() {
		btn = new Button("Click me!");	// �ʵ� �ʱ�ȭ
	}
	
	public void go() {
		add(btn);	// this. ���� -> this�� Frame
		
		setSize(500, 500);	// this. ���� 
		setVisible(true);	// this. ����
	}
	
	public static void main(String[] args) {
		Frame01 f = new Frame01();
		f.go();
	}

}
