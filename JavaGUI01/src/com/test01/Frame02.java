package com.test01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Frame02 extends Frame{
	Button btn01, btn02, btn03, btn04, btn05;
	
	public Frame02(){
		btn01 = new Button("위");
		btn02 = new Button("아래");
		btn03 = new Button("오른쪽");
		btn04 = new Button("왼쪽");
		btn05 = new Button("가운데");
	}
	
	public void go() {
		
		//setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		add(btn01,BorderLayout.NORTH);
		add(btn02,BorderLayout.SOUTH);
		add(btn03,BorderLayout.EAST);
		add(btn04,BorderLayout.WEST);
		add(btn05,BorderLayout.CENTER);
		
		btn01.setBackground(Color.black);
		btn02.setBackground(Color.blue);
		btn03.setBackground(Color.CYAN);
		btn04.setBackground(Color.green);
		btn05.setBackground(Color.red);
		
		btn01.setForeground(Color.white);
		btn02.setForeground(Color.white);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Frame02 f = new Frame02();
		f.go();
		
	}

}
