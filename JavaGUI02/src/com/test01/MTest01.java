package com.test01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.test04.FrameTest02;

public class MTest01 extends Frame{
	
	MenuBar mb;
	Menu m_file;
	MenuItem n_frame, n_open, n_save, n_newsave, n_page, n_print, n_end, p_open, p_save, p_newsave;
	
	PopupMenu pm;
	TextArea ta;
	
	public MTest01() {
		
		super("메뉴 연습");
		
		m_file = new Menu("파일");
		mb = new MenuBar();
		
		// MenuBar에 단축기 만들기
		n_frame = new MenuItem("새로 만들기(N)", new MenuShortcut(KeyEvent.VK_N));
		n_open = new MenuItem("열기(O)", new MenuShortcut(KeyEvent.VK_O));
		n_save = new MenuItem("저장(S)", new MenuShortcut(KeyEvent.VK_S));
		n_newsave = new MenuItem("다른 이름으로 저장");
		n_page = new MenuItem("페이지 설정");
		n_print = new MenuItem("인쇄");
		n_end = new MenuItem("끝내기(X)", new MenuShortcut(KeyEvent.VK_X));
		
		pm = new PopupMenu("팝업");
		p_open = new MenuItem("열기", new MenuShortcut(KeyEvent.VK_A));
		p_save = new MenuItem("저장", new MenuShortcut(KeyEvent.VK_S));
		p_newsave = new MenuItem("다른 이름으로 저장");
		
		ta = new TextArea();
		
	}
	
	public void go() {
		
		// Menu에다가 MenuItem들을 올림
		m_file.add(n_frame);
		m_file.add(n_open);
		m_file.add(n_save);
		m_file.add(n_newsave);
		m_file.add("-");	// m_file.addSeparator(); 와 똑같이 칸 나누기 역할을 한다.
		m_file.add(n_page);
		m_file.add(n_print);
		m_file.addSeparator();
		m_file.add(n_end);
		
		// MenuBar에다가 Menu 올리기
		mb.add(m_file);
		
		// Frame에다가 MenuBar 올리기
		this.setMenuBar(mb);
		
		// TextArea() 올리기
		add(ta);	// this 생략
		
		// 팝업메뉴 올리기
		pm.add(p_open);
		pm.add(p_save);
		pm.add(p_newsave);
		add(pm);	// Frame에다가 PopupMenu 올리기
		
		// event
		TestEvents events = new TestEvents();	
		addWindowListener(events);	// x 버튼 클릭시 화면 캔슬
		
		n_end.addActionListener(events);	// 파일 -> 끝내기 클릭시 종료
		n_frame.addActionListener(events);
		n_open.addActionListener(events);
		
		ta.addKeyListener(events);
		ta.addMouseMotionListener(events);
		ta.addMouseListener(events);
		
		// 화면
		setSize(400, 300);
		setVisible(true);
		
	}
	
	// inner class
	class TestEvents extends WindowAdapter implements ActionListener, KeyListener, MouseMotionListener, MouseListener{
		
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			MenuItem mi = (MenuItem)e.getSource();
			
			if(mi.getActionCommand().trim().equals("끝내기(X)")) {
				System.exit(0);
			}
			
			switch(mi.getShortcut().getKey()) {
			case KeyEvent.VK_N :
				ta.setText("\0");
				ta.setBackground(Color.WHITE);
				break;
			case KeyEvent.VK_O :
				new FrameTest02().go();
				break;
			}
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			ta.append("\n" +" Typed key is : [" + e.getKeyChar()+"]\n");
			if(e.isShiftDown()) {
				ta.append("-Shif is down ! \n");
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
			String str = String.format("x:%3d, y:%3d\n",e.getX(),e.getY());
			ta.append(str);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			ta.setBackground(Color.PINK);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			ta.setBackground(Color.yellow);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getButton() ==3) {
				pm.show(ta, e.getX(), e.getY());
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new MTest01().go();
		
	}

	
	
}








