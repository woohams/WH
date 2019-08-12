package com.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket serviceSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			serverSocket = new ServerSocket(9999);	// 주어진 포트(9999)로 서버소켓 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("client를 기다립니다...");
			
			try {
				serviceSocket = serverSocket.accept();	// 클라이언트의 연결 요청이 들어올때까지 블로킹된 채로 기다리며 
														// 연결 수립이 되면 클라이언트와 통신 가능한 Socket 객체를 반환
				System.out.println("client가 접속했습니다...");
			
				in = new BufferedReader(	// 입력문자(reader) 코드 -> 모니터
						new InputStreamReader(	//Input : File -> Moniter	(받아서 출력, 서버에서는 클라이언트에서 들어오는 것)
								serviceSocket.getInputStream()));	// 데이터 스트림에 받아서 버퍼에 저장시켜 한번에 받는다.
				
				out = new PrintWriter(	// 출력문자(writer) 모니터 -> 컴퓨터(코드)
						serviceSocket.getOutputStream(),true);	//Output : Moniter -> Computer
				
				String inputLine;
				while((inputLine=in.readLine()) != null) {	// 나한테 들어오는것을 한줄씩 읽어들이면서 null이 될때까지 while실행
					System.out.println("client : "+ inputLine);
					out.println("★"+inputLine);
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}









