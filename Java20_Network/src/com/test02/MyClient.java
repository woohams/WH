package com.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient implements Runnable{

	@Override
	public void run() {
		try {
			Socket clientSocket = null;
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdIn = null;
			
			System.out.println("server에 접속합니다...");
			clientSocket = new Socket("localhost",9999);
			
			out = new PrintWriter(
					clientSocket.getOutputStream(),true);
			
			in = new BufferedReader(
					new InputStreamReader(
							clientSocket.getInputStream()));
			
			stdIn = new BufferedReader(	//stdIn : standard Input : 표준입력 // 화면에 입력하는 것(키보드)을 읽어오는 일을한다. 
						new InputStreamReader(
							System.in));	// Console 창 이용, Scanner에서도 System.in 사용한것과 같다.
			
			String inputLine;
			while((inputLine = stdIn.readLine()) != null) {	// server -> client, 한 줄씩 받는다.	
				out.println(inputLine);
				System.out.println("sever : "+ in.readLine());
			}
			
			stdIn.close();
			in.close();
			out.close();
			clientSocket.close();
			System.out.println("소켓 끊어짐...");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClient());
		t1.start();
	}
}






