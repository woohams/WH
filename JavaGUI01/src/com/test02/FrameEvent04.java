package com.test02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// �̺�Ʈ ���� ��� 4. ��ӹ޾Ƽ� �ʿ��� �͸� ���
public class FrameEvent04 extends Frame implements WindowListener{
	
	/*
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ����ȭ : �ٸ� ������ ����ϱ� ���� ����Ʈ�� ����(����ȭ)
	
	Button btn;
	
	public FrameEvent04() {
		btn = new Button("������ ����!!!!");
	}
	
	public void go() {
		add(btn);
		
		this.addWindowListener(this);
	//  Frame�� this			Window�� this	
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
		System.exit(0);	// 0 : ���� ���� 
						// 1: ������ ����
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
