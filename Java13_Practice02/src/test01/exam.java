package test01;

public class exam {

	public static void main(String[] args) {

		// gugu();
		// sosu();
		// samhang();
		//double [] num = { 5, 6, 7, 8, 9 };
		//System.out.println("num 배열의 합 : "+sum(num));
		//System.out.println("num 배열의 평균 : " + avg(num));
		//square(5);
	}

	public static void gugu() {

		for (int i = 2; i < 10; i++) {
			System.out.println("<<" + i + "단>>");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}
	}

	public static void sosu() {

		int num, cnt, i;
		for (num = 2; num <= 100; num++) {
			cnt = 0;
			for (i = 2; i < num; i++)
				if (num % i == 0) // num / i 가 나누어 떠러지면
					cnt += 1; // cnt + 1;
			if (cnt == 0) // cnt ==0 이면 소수
				System.out.println(num + "은(는) 소수다.");
		}

	}

	public static void samhang() {

		int kor = 100;
		int eng = 60;
		int math = 86;

		int sum = kor + eng + math;
		double avg = sum / 3;

		String grade = (avg >= 90) ? "A" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : (avg >= 60) ? "D" : "F";
		System.out.println("당신의 성적은 " + grade + "입니다.");

	}

	public static int sum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum;
	}

	public static double avg(double[] array) {

		double sum = 0.0;

		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / (double)array.length;
	}
	
	public static void square(int a) {
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				if(i==1||i==a||j==1||j==a) {
				System.out.print("*");
				}else if(j!=1||j!=a) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void login() {
		
		
	}
}
