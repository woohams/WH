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
		
		//			보여지는 개수, 다중체크 여부
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
		cc.add("봄");
		cc.add("여름");
		cc.add("가을");
		cc.add("겨울");
		p02.add(cc);
		
		//p03
		lst.add("월");
		lst.add("화");
		lst.add("수");
		lst.add("목");
		lst.add("금");
		lst.add("토");
		lst.add("일");
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
		
		// 화면
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
			
//			Checkbox cb = (Checkbox)e.getSource();	// event를 발생시킨 얘를 데려와 checkbox로 형변환하여
//			if(cb.getState()) {	// 만약 그것을 선택하면 그 체크박스의 이름과 " : 선택!!" 을 출력.
//				System.out.println(cb.getLabel()+" : 선택!!");
			
//			if(cc.getSelectedItem().equals("봄")) {
//				p02.setBackground(Color.pink);
//			}else if(cc.getSelectedItem().equals("여름")) {
//				p02.setBackground(Color.blue);
//			}else if(cc.getSelectedItem().equals("가을")) {
//				p02.setBackground(Color.red);
//		}else if(cc.getSelectedItem().equals("겨울")) {
//			p02.setBackground(Color.black);		
//		}
			// a(객체) instanceof b(클래스) : a가 b 타입인지 아닌지를 판별
			if(e.getSource() instanceof Checkbox) {
					System.out.println(((Checkbox)e.getSource()).getLabel() + " 체크!!");
					switch (cc.getSelectedItem()) {
					case "봄":
						p02.setBackground(Color.pink);
						break;
					case "여름":
						p02.setBackground(Color.blue);
						break;
					case "가을":
						p02.setBackground(Color.red);
						break;
					case "겨울":
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





