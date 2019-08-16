package com.test01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MTest03 extends Frame{
	
	Panel p01, p02;
	ScrollPane sp;
	TextArea ta;
	
	Button btn01, btn02, btn03, btn04;
	
	Dialog d01;
	FileDialog fd, fs;
	
	public MTest03() {
		p01 = new Panel();
		p02 = new Panel();
		sp = new ScrollPane();
		ta = new TextArea();
		
		btn01 = new Button("1");
		btn02 = new Button("2");
		btn03 = new Button("!");
		btn04 = new Button("4");
		
		d01 = new Dialog(this,"?",true);
		fd = new FileDialog(this,"열기",FileDialog.LOAD);
		fs = new FileDialog(this,"저장",FileDialog.SAVE);
	}
	
	public void go() {
		p01.setBackground(Color.pink);
		p01.setSize(300,250);
		p01.setLayout(new BorderLayout());
		p01.add("Center", ta);
		
		p02.add(btn01);
		p02.add(btn02);
		p02.add(btn03);
		p02.add(btn04);
		
		p01.add("South", p02);	// 패널 안에 패널 
		
		d01.add(new Button("test"));
		d01.setSize(100,100);
		
		sp.add(p01);
		add("Center", sp);
		
		//events
		btn01.addActionListener(new Events());
		btn02.addActionListener(new Events());
		btn04.addActionListener(new Events());
		
		d01.addWindowListener(new Events());
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {				
				//System.exit(0);
				dispose();
			}
			
		});
		
		// 화면
		setSize(600, 400);
		setVisible(true);
		
		
		
		
	}
	
	class Events extends WindowAdapter implements ActionListener{

		
		@Override
		public void windowClosing(WindowEvent e) {
			//System.exit(0);
			// 만일 이벤트를 방생시킨 객체의 타입이 Dialog 라면
			if(e.getSource().getClass() == Dialog.class) {
				d01.setVisible(false);
			}
			
			// 만일 이벤트를 발생시킨 객체의 타입이 MTest03 이라면
			if(e.getSource().getClass() == MTest03.class) {
				System.exit(0);
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().trim().equals("1")) {
				d01.setVisible(true);
			}
			if(e.getActionCommand().trim().equals("2")) {
				fd.setVisible(true);
			}
			if(e.getActionCommand().trim().equals("4")) {
				fs.setVisible(true);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new MTest03().go();
	}
	
}





