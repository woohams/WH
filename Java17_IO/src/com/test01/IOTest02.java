package com.test01;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest02 {

	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		try {
			MyOutput(fi);
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		try {
			MyInput(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	// throw : 특정 예외를 발생시키는 키워드 
	// throws : 이 메소드를 호출하는 얘한테 미루는 역할을 한다.(여기서는 main이 try/catch를 해준다)
	//						main에서도 throws를 선언해버리면 예외처리를 하지않고 넘어가는것을 의미한다.
	private static void MyInput(File fi) throws IOException {	//Input : 코드에서 모니터로 가지고 오는 것
		FileReader fr = new FileReader(fi);
		
		int ch;
		// file의 처음부터 끝까지(-1) 한 글자씩 읽어온다.
		//				file이 끝나면 -1을 return
		while((ch=fr.read()) != -1) {
			System.out.print((char)ch);	// (char)형으로 안바꿔주면 숫자 출력
		}
		fr.close();
	}
	
	private static void MyOutput(File fi) throws IOException {	//OutPut : 모니터에서 컴퓨터로 입력해 주는 것
		FileWriter fw = new FileWriter(fi, false);	// true로 놓으면 맨 마지막부터.. 실행 할때마다 하나씩 추가. 
													// false로 하면 처음부터 덮어 씌우기 때문에 하나만 출력. 
		fw.write("연습중입니다.\n");
		fw.append("abc\n");
		
		fw.close();	// 가장 늦게 열린것을 가장 먼저 닫는다. STACK 구조와 비슷, LIFO...
	}

}
