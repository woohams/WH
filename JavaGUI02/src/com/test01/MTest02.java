package com.test01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MTest02 extends Frame{
	
	Panel p01, p02;
	Scrollbar Rscr, Gscr, Bscr;
	TextArea ta;
	
	public MTest02() {
		
		p01 = new Panel(new GridLayout(3,1));
		
		// RGB
		Rscr = new Scrollbar(Scrollbar.HORIZONTAL,255,1,0,255);
		Gscr = new Scrollbar(Scrollbar.HORIZONTAL,255,1,0,255);
		Bscr = new Scrollbar(Scrollbar.HORIZONTAL,255,1,0,255);
		
		p02 = new Panel();
		ta = new TextArea();
			
	}
	
	public void go() {
		
		setLayout(new GridLayout(2,1));
		
		p01.setSize(100,100);
		p01.add(Rscr);
		p01.add(Gscr);
		p01.add(Bscr);
		
		Rscr.setBackground(Color.red);
		Gscr.setBackground(Color.green);
		Bscr.setBackground(Color.blue);
		
		p02.add(ta);
		
		add(p01);
		add(p02);
		
		// event
		Rscr.addAdjustmentListener(new SliderEvents());
		Gscr.addAdjustmentListener(new SliderEvents());
		Bscr.addAdjustmentListener(new SliderEvents());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		// 화면
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	class SliderEvents implements AdjustmentListener{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			int red = 0;
			int green = 0;
			int blue = 0;
			
			// 각각의 slider가 가진 값을 가져와서 red, green, blue에 대입하자.
			red = Rscr.getValue();
			green = Gscr.getValue();
			blue = Bscr.getValue();
			
			ta.setBackground(new Color(red, green, blue));
			
			//--------------------------
			
			
			
			
			ta.setBackground(new Color(red, green, blue));
			
		}
		
		
	}
	
	public static void main(String[] args) {
		new MTest02().go();
	}
	

}











