package com.test03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer02 {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(8888);	// 8888포트로 UDP 소켓 생성
		System.out.println("서버입니다.");
		
		byte[] buff = new byte[1024];	
		
		DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);	// 데이터 그램과 데이터의 길이를 갖고 객체 생성
																				// UDP는 데이터패킷을 감싸서 주고 받는다. -> 그러기 때문에 속도가 빠름
																				// TCP는 byte기반으로 주고 받기 때문에 안정성이 뛰어난 대신 비교적 속도가 느릴 수 있다.
		ds.receive(receivePacket);	// 소켓으로부터 데이터그램패킷을 수신
		System.out.println(new String(receivePacket.getData()));	//데이터 버퍼를 반환
		
		ds.close();
		ds.disconnect();
	}
}


