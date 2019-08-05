package test01;

import java.util.Scanner;

public class MTest {

	
	public static void main(String[] args) {
		
		/*System.out.println("1. 5개짜리 배열에 랜덤한수 1~9를 넣고 출력하기");
		
		int [] a = new int [5];
		
		for (int i = 0 ; i < a.length ; i++) {
			a[i] = (int)(Math.random()*9)+1;
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
		
		System.out.println("2. Gen 클래스에서 타입 지정하지 않고 생성자 2개 짜리로 호출");
		Gen<String, Integer> m = new Gen<String, Integer>("홍길동", 30);
		System.out.println();
				
		System.out.println("3. 숫자 40까지 배열로 짝수 출력 그후 역순 출력");
		int cnt = 0;
		int [] jj = new int [41];
		for(int i = 1; i < jj.length; i++) {
			jj[i] = i;			
			
			
		}
		
		for(int i = 1; i < jj.length; i++) {
			if(i%2==0) {
				System.out.print("\t"+jj[i]);
			}
			if(cnt%10==0) {
				System.out.println();				
			}
			cnt++;			
		}
		
		System.out.println();
		
		for(int i = jj.length; i > 0; i--) {
			if(i%2==0) {
				System.out.print("\t"+jj[i]);
			}
			if(cnt%10==0) {
				System.out.println();				
			}
			cnt++;			
		}
		
		System.out.println("4. 1000보다 작은 자연수 중에서 3또는 5의 배수를 모두 더하면 얼마일까요?");
		int sum = 0;
		for(int i = 1 ; i < 1000 ; i++) {
			if(i%3==0 || i%5==0 ) {			
				sum += i;
			}
			
		}
		System.out.println(sum);
		
		
		System.out.println("5. 1부터 100까지의 소수를 출력하고 그값의 합계를 구하자.");
		
		System.out.println("6. 아무 한글 5개를 입력한 배열 3개를 만들어 3글자가 조합된 문자열 10개를 출력하자. ");*/
		
		
	
	
	
		System.out.println("7. 코인노래방");		

		int c500 = 0;
		int c1000 = 0;
		int money = 0;
		int song = 0;
		
		
		
		System.out.println("금액을 투입하세요 500원 = 1곡 1000원 = 3곡");
		Scanner sc = new Scanner(System.in);
		System.out.println("500원 짜리 동전을 몇개 넣으시겠습니까?");
		c500 = sc.nextInt();
		System.out.println("1000원 짜리 지폐를 몇개 넣으시겠습니까?");
		c1000 = sc.nextInt();
		money = (c500 * 500) + (c1000 * 1000);
		System.out.println("투입한 금액은 : "+money+"원 입니다.");
		song = (c500*1) + (c1000*3);
		System.out.println("곡수는 : "+song+"곡 입니다.");
		
		for(int i = song ; i > 0; i--) {			
			System.out.println("노래를 선곡하여 주십시오 (숫자아무거나입력)");
			sc.nextInt();
			--song;
			System.out.println("남은 곡수는 : "+song+"곡 입니다.");
				if(song==0) {
					System.out.println("이용해주셔서 감사합니다");
				}
		
		 
			}
		
			
	}
		
				

				
		
}
	