package test01;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {

		System.out.println("수를 결정했습니다. 맞춰보세요.");

		int randomNum = 0;
		int userNum = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		randomNum = (int) (Math.random() * 100) + 1;
		
		do {
			cnt++; 
			userNum = sc.nextInt();
			if(userNum < randomNum) {
				System.out.println("up");
			}else if (userNum > randomNum) {
				System.out.println("down");
			}else {
				System.out.println("정답입니다. " + cnt + "회 만에 정답을 맞췄습니다.");
			}
		} 
		while (randomNum != userNum);
	}
}