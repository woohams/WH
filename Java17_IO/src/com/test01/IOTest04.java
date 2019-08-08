package com.test01;

import java.io.File;

public class IOTest04 {
	
	public static void main(String[] args) {
		
		File fi = new File("c:\\");
		//printFile01(fi);
		printFile02(fi);
		
	}
	public static void printFile02(File fi) {
		// 파일 목록과 디렉토리 목록을 구분하여 출력하자.		
		int fileCnt = 0;
		int dirCnt = 0;
		
		for(File f : fi.listFiles()) {
			if(f.isDirectory()) {	// folder 면 dir> 아니면 file>
				dirCnt++;
				System.out.println("dir > "+f);
			}else {
				fileCnt++;
				System.out.println("file> "+f);
			}
			
		}
		System.out.println("폴더의 갯수 : "+dirCnt);
		System.out.println("파일의 갯수 : "+fileCnt);
		
	}

	private static void printFile01(File fi) {

		for(String list : fi.list()) {	//foreach문
			System.out.println(list);
			
		}
		
	}

}
