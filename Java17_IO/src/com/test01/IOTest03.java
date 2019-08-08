package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest03 {
	
	public static void main(String[] args) {
		
		File fi = new File("b.txt");
		MyOutput(fi);
		MyInput(fi);
		
		
	}
	
	public static void MyOutput(File fi) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fi);
			fw.write("이번에도 연습중!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	// 에러가 나던 말던 무조건 한번 실행해준다.
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void MyInput(File fi) {
		
		// try with resource (예외가 날수 있는 명령)
		try(FileReader fr = new FileReader(fi)){
			
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



