package com.test01;

import java.io.File;
import java.io.IOException;

public class IOTest01 {

	public static void main(String[] args) {
		
		// 해당 경로에 fi를 생성
		File fi = new File("c:/TEST_IO");
		
		if(fi.exists()) {
			System.out.println("exists!");	// 존재한다면 ..
		}	else {	// 존재하지 않는다면 ..
			System.out.println("new!");
			// 디렉토리(폴더) 생성
			fi.mkdir();
		}
		
		// fi 밑에(하위에) AA 생성
		File fi01 = new File(fi, "AA");
		fi01.mkdir();
		
		File fi02 = new File("c:/TEST_IO", "BB");	// 똑같음
		fi02.mkdir();
		
		// fi01 밑에 a.txt를 생성 (텍스트 파일, 메모장)
		File fiText = new File(fi01, "a.txt");
		
		try {
			fiText.createNewFile();
		} catch (IOException e) {
			//IOExecption은 대표적인 Checked Exception
			e.printStackTrace();
		}	
	}
	
}





