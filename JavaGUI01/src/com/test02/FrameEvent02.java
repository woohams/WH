package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̺�Ʈ ���� ��� 2. inner class�� ����� �̺�Ʈ ����(�̺�Ʈ�� ���� ��)
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
