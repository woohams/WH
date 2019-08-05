package test01;

import java.io.IOException;
import java.io.InputStreamReader;

public class practice {
	
	public static void main(String[] args) {
		
		InputStreamReader rd = new InputStreamReader(System.in);
		
		try {
		while(true) {	// ctrl + z 누르면 종료 !!
			int a;
				a = rd.read();
				if(a== -1)	// ctrl + z 가 눌리면 -1이 리턴된다. 그전 까지는 while문 안을 무한 반복 !!
				System.out.println((char)a);
			} 
		}
		catch (IOException e) {
				e.printStackTrace();		
		}
	}

}
