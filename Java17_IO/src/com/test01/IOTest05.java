package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest05 {
	
	public static void main(String[] args) {
		//c.txt 파일을 만들고 
		File fi = new File("c.txt");
		//A~Z까지의 문자를 입력하고 
		MyOutput(fi);
		//c.txt파일을 읽어서 출력하자.
		try {
			MyInput(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void MyInput(File fi) throws IOException {	// main 메소드로 미뤄버림
		FileInputStream finput = new FileInputStream(fi);
		
		int res = 0;
		
		while((res = finput.read()) !=-1) {
			System.out.print((char)res+" ");
		}
		finput.close();
	}



	private static void MyOutput(File fi) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(fi);
			
			for(int i =65; i<=90; i++) {
				fo.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch	(IOException e) { //fo.write(i) 예외처리
			
		} finally {
			try {
				fo.close();	// close
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
