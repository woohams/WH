package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̺�Ʈ ���� ��� 1 : (ActionListener) ��� ���� �� this�� ����
public class FrameEvent01 extends Frame implements ActionListener{
	
	Button btn;
	
	public FrameEvent01() {
		
		btn = new Button("Click me!!");
	}
	
	public void go() {
		
		add(btn);
		
		// event
		btn.addActionListener(this);
		
		setSize(200, 200);
		setVisible(true);				
	}
	
	public static void main(String[] args) {
		
		FrameEvent01 f = new FrameEvent01();
		f.go();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(e.getActionCommand());
		
		System.out.println(e);
		System.out.println(e.getSource());
		System.out.println(e.getID());
		
		System.out.println("===============================================");
		
		Button b = (Button)e.getSource();
		System.out.println(b.getLabel());
		System.out.println(b.getName());
		System.out.println(b.getSize());
		
	}

}


