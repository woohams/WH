package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 이벤트 정의 방법 4. 상속받아서 필요한 것만 사용
public class FrameEvent04 extends Frame implements WindowListener{
	
	/*
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 직렬화 : 다른 곳에서 사용하기 위해 바이트를 정렬(직렬화)
	
	Button btn;
	
	public FrameEvent04() {
		btn = new Button("마지막 교시!!!!");
	}
	
	public void go() {
		add(btn);
		
		this.addWindowListener(this);
	//  Frame의 this			Window의 this	
		setSize(200, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameEvent04().go();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing");
		System.exit(0);	// 0 : 정상 종료 
						// 1: 비정상 종료
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened");
		
	}

}
