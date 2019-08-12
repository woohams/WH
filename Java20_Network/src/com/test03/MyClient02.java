package com.test03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MyClient02 {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트 입니다.");
		
		byte[] buff = "연습입니다.".getBytes();

		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),8888);

		ds.send(sendPacket);
	
		ds.close();
		ds.disconnect();
	}
}



