package com.test04;


import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/*
 * 1. TextField���� ���� �Է��ϰ� enter ġ�� ���� ��Ŀ���� �̵�
 * (�̸� -> �ּ� -> ��ȭ��ȣ -> �̸�) VK_ENTER requestFocus()
 *  2.Ȯ�� ��ư�� Ŭ���ϸ� tareas�� ��ü ���� �߰�
 * 3. ��� ��ư�� Ŭ���ϸ� �̸�, �ּ�, ��ȭ��ȣ�� ���� ����
 * 4. ���� ��ư�� Ŭ���ϸ� ��� ���� ����
 */
public class FrameTest02 extends Frame{
	
	Panel p01, p02;
	Label lbname, lbaddr, lbtel;
	TextField txtname, txtaddr, txttel;
	TextArea tareas;
	Button btnok, btncn, btnre;
	CheckboxGroup cbg;
	Checkbox c01, c02;
	
	public FrameTest02() {
		p01 = new Panel();
		lbname = new Label("��	��");
		lbaddr = new Label("��	��");
		lbtel = new Label("��ȭ��ȣ");
		txtname = new TextField(30);
		txtaddr = new TextField(30);
		txttel = new TextField(30);
		cbg = new CheckboxGroup();
		c01 = new Checkbox("����",cbg,true);
		c02 = new Checkbox("����",cbg,false);
		btnok = new Button("Ȯ��");
		btncn = new Button("���");
		p02 = new Panel();
		tareas = new TextArea(5,35);
		btnre = new Button("����");
	}
	
	public void go() {
		
		setLayout(new GridLayout(2,1));
		
		p01.setLayout(new GridLayout(5,2));
		p01.add(lbname);
		p01.add(txtname);
		
		p01.add(lbaddr);
		p01.add(txtaddr);
		
		p01.add(lbtel);
		p01.add(txttel);
		
		p01.add(c01);
		p01.add(c02);
		
		p01.add(btnok);
		p01.add(btncn);
		
		p02.add(tareas);
		p02.add(btnre);
		add(p01);
		add(p02);
		
		txtname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {	// ENTER�� ġ��
					txtaddr.requestFocus();		//Focus�� txtaddr�� ..
				}
				
			}
			
		});
		
		txtaddr.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar()==KeyEvent.VK_ENTER) {
						txttel.requestFocus();
					}
				}
		});
		
		txttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					txtname.requestFocus();
				}
			}
	});
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {				
				System.exit(0);
			}
			
		});
	
	
		MyEvent my = new MyEvent();
		btnok.addActionListener(my);
		btncn.addActionListener(my);
		btnre.addActionListener(my);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel().equals("Ȯ��")) {
				String res = "";
				
				if(c01.getState()) {	//c01�� ���õǾ� �ִٸ�
					res += "����:"+c01.getLabel()+" ";
				}else if(c02.getState()) {
					res += "����:"+c02.getLabel()+" ";
				}
				res += " �̸�:"+txtname.getText()+" �ּ�:"+txtaddr.getText()+" ��ȭ��ȣ:"+txttel.getText();
				
				tareas.append(res);
			}
			if(btn.getLabel().equals("���")) {
				txtname.setText("");
				txtaddr.setText("");
				txttel.setText("");
			}
			if(btn.getLabel().equals("����")) {
				txtname.setText("");
				txtaddr.setText("");
				txttel.setText("");
				tareas.setText("");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new FrameTest02().go();
	}

}




