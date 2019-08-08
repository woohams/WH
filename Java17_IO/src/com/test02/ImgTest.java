package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgTest {
	
	public static void main(String[] args) throws IOException {
		// a.jpg를 가져와서
		// 다른 이름으로 저장하고 싶다.
		
		String fileName = "a.jpg";
		/*
		FileInputStream fi = new FileInputStream(fileName);
		BufferedInputStream bi = new BufferedInputStream(fi);
		*/
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
		
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));
		
		int a = 0;
		while((a=bi.read()) != -1) {
			fo.write(a);;
		}
		fo.close();	// 열은 것과 역순으로
		bi.close();
	}

}









