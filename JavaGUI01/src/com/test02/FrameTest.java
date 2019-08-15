package com.test02;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest extends Frame{
	
	Panel p01,p02,p03,p04;
	
	Checkbox c01, c02, c03;
	CheckboxGroup cbg;
	
	Choice cc;
	List lst;
	//Java awt list
	TextField tf;
	
	public FrameTest() {
		p01 = new Panel();
		p02 = new Panel();
		p03 = new Panel();
		p04 = new Panel();
		
		cbg = new CheckboxGroup();
		c01 = new Checkbox("one",cbg,true);
		c02 = new Checkbox("two",cbg,true);
		c03 = new Checkbox("three",cbg,true);
		
		cc = new Choice();
		
		//			�������� ����, ����üũ ����
		lst = new List(  4, 	true);
		
		tf = new TextField(30);
	
	}
	
	public void go() {
		
		setLayout(new GridLayout(4,1));
		
		//p01
		p01.add(c01);
		p01.add(c02);
		p01.add(c03);
		
		
		//p02
		cc.add("��");
		cc.add("����");
		cc.add("����");
		cc.add("�ܿ�");
		p02.add(cc);
		
		//p03
		lst.add("��");
		lst.add("ȭ");
		lst.add("��");
		lst.add("��");
		lst.add("��");
		lst.add("��");
		lst.add("��");
		p03.add(lst);
		
		//p04
		p04.add(tf);
		
		//frame
		add(p01);
		add(p02);
		add(p03);
		add(p04);
		
		//events
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		
		MyEvents my = new MyEvents();
		c01.addItemListener(my);
		c02.addItemListener(my);
		c03.addItemListener(my);
		
		cc.addItemListener(my);
		
		lst.addItemListener(my);
		
		tf.addKeyListener(my);
		tf.addTextListener(my);
		
		// ȭ��
		setSize(400,400);
		setVisible(true);
	}
	
	//inner class
	class MyEvents implements ItemListener, KeyListener, TextListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			System.out.println(e);
			
//			if(e.getStateChange() == ItemEvent.SELECTED) {
//				System.out.println(e.getItem() + " : selected !!");
//			}
			
//			Checkbox cb = (Checkbox)e.getSource();	// event�� �߻���Ų �긦 ������ checkbox�� ����ȯ�Ͽ�
//			if(cb.getState()) {	// ���� �װ��� �����ϸ� �� üũ�ڽ��� �̸��� " : ����!!" �� ���.
//				System.out.println(cb.getLabel()+" : ����!!");
			
//			if(cc.getSelectedItem().equals("��")) {
//				p02.setBackground(Color.pink);
//			}else if(cc.getSelectedItem().equals("����")) {
//				p02.setBackground(Color.blue);
//			}else if(cc.getSelectedItem().equals("����")) {
//				p02.setBackground(Color.red);
//		}else if(cc.getSelectedItem().equals("�ܿ�")) {
//			p02.setBackground(Color.black);		
//		}
			// a(��ü) instanceof b(Ŭ����) : a�� b Ÿ������ �ƴ����� �Ǻ�
			if(e.getSource() instanceof Checkbox) {
					System.out.println(((Checkbox)e.getSource()).getLabel() + " üũ!!");
					switch (cc.getSelectedItem()) {
					case "��":
						p02.setBackground(Color.pink);
						break;
					case "����":
						p02.setBackground(Color.blue);
						break;
					case "����":
						p02.setBackground(Color.red);
						break;
					case "�ܿ�":
						p02.setBackground(Color.black);
						break;
					}
			} else if(e.getSource() instanceof List) {
					String[] res = ((List) e.getSource()).getSelectedItems();	
					for(String s : res) {
						System.out.println(s);
					}
				}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed");
			
			if(e.getKeyChar() == KeyEvent.VK_ENTER) {
				System.out.println(((TextField)e.getSource()).getText());;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped");
			
		}

		@Override
		public void textValueChanged(TextEvent e) {
			if(e.getSource() instanceof TextField) {
				TextField t = (TextField)e.getSource();
				System.out.println(t.getText());
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new FrameTest().go();
		
	}
}





