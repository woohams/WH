package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 이벤트 정의 방법 2. inner class를 만들어 이벤트 실행(이벤트가 많을 때)
public class FrameEvent02 extends Frame{
	
	Button btn;
	int cnt;
	
	public FrameEvent02() {
		btn = new Button("Push!!");
		cnt = 0;
	}
	
	public void go() {
		add(btn);
		
		btn.addActionListener(new MyEvent());
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameEvent02 f = new FrameEvent02();
		f.go();
	}
	
	public class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			Button b = (Button)e.getSource();
			b.setLabel(++cnt +"");
		}
		
	}

}
