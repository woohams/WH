package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̺�Ʈ ���� ��� 3. �ѹ��� ���� ������.
public class FrameEvent03 extends Frame{
	
	Button btn;
	
	public FrameEvent03() {
		btn = new Button("click!");
		go();
	}
	
	public void go() {
		add(btn);
		
		btn.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrameEvent03();
	}

}
