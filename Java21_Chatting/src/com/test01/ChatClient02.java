package com.test01;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class ChatClient02 extends Frame implements Runnable{
	
	Socket clientSocket = null;
	PrintWriter out = null;
	BufferedReader in = null;
	
	TextArea outputArea;
	TextField inputField;
	
	public ChatClient02(String title){
		super(title);
		
		setLayout(new BorderLayout());
		
		outputArea = new TextArea();
		outputArea.setEditable(false);
		
		add(outputArea,"Center");
		inputField = new TextField();
		add(inputField,"South");
		
		inputField.addActionListener(new InputListener());
	}
	
	public void addMessage(String msg){
		outputArea.append(msg);
	}

	public void connect(String host, int port){
		// Server와의 통신 ?
		try {
			clientSocket = new Socket(host,port);
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		} catch (Exception e) {
			System.err.println("입출력 에러입니다.");
			System.exit(1);
		}
		
	}
	public void disconnect(){
		try{
			in.close();
			out.close();
			clientSocket.close();
		}catch(IOException e){
			
		}
	}
	
	@Override
	public void run() {
		try{
			while(true){
				addMessage(in.readLine()+"\n");
			}
		}catch(IOException e){
			disconnect();
		}
	}
	public static void main(String[] args) {
		ChatClient02 mf = new ChatClient02("자바 채팅 클라이언트");
		mf.pack();
		mf.setSize(500,300);
		mf.setVisible(true);
		
		mf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

//		mf.connect("192.168.10.33", 9999);
		mf.connect("localhost", 8888);
		
		Thread thread = new Thread(mf);
		thread.start();
	}
	
	class InputListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input = inputField.getText();
			inputField.setText("");
			try{
				out.println(input);
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}	
	}
}
