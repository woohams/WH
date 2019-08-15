package com.test03;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout01 implements ActionListener{
	
	Frame frame;
	Button btn01, btn02, btn03, btn04;
	CardLayout card;
	
	public Layout01() {
		frame = new Frame("CardLayoutTest");
		
		card = new CardLayout();
		
		btn01 = new Button("Button 01");
		btn02 = new Button("Button 02");
		btn03 = new Button("Button 03");
		btn04 = new Button("Button 04");
		
		addListener();	// 생성자에서 addListener 호출
		go();
	}
	
	public void addListener() {
		btn01.addActionListener(this);
		btn02.addActionListener(this);
		btn03.addActionListener(this);
		btn04.addActionListener(this);	
	}
	public void go() {
		// layout 설정
		frame.setLayout(card);
		
		// component
		frame.add(btn01);
		frame.add(btn02);
		frame.add(btn03);
		frame.add(btn04);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		card.next(frame);
		
	}
	public static void main(String[] args) {
		new Layout01();
	}

}






