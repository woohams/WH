package com.test04;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



// 1. 버튼을 누르면 해당 버튼의 text를 console에 출력하자.
// 2. x버튼을 누르면 프로그램을 종료하자.

public class FrameTest01 extends Frame {

	Button btn;
		
	public FrameTest01() {
		btn = new Button("test");				
	}
	
		
	public void go() {
		add(btn);
		
		btn.addActionListener(new Event());
		
		setSize(200,200);
		setVisible(true);
		
		
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {				
				System.exit(0);
			}
			
		});
	}
		
	public static void main(String[] args) {
		FrameTest01 f = new FrameTest01();
		f.go();
	}
	class Event implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			Button b = (Button)e.getSource();
		}
		
	}
	
}




