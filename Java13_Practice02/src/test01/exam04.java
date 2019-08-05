package test01;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {

		String id = "qkqejd";
		int password = 1234;
		int cnt =0;

		Scanner sc = new Scanner(System.in);
		
		for(int c=0; c<3; c++) {
			System.out.println("ID를 입력하시오 : ");
			String i = sc.next();
			System.out.println("PASSWORD를 입력하시오 : ");
			int p = sc.nextInt();
		if (id.equals(i)&&password == p) {	//string은 주소를 비교하므로 값을 비교하기 위해 equlas를 사용
			System.out.println("로그인에 성공하셨습니다 !");
		}else {
			System.out.println("로그인에 실패하셨습니다 !");
			cnt++;
		}
		}if(cnt ==3) {
			System.out.println("로그인 횟수제한이 초과되었습니다.");
				
		}
	}

}
