package test01;

public class practice4 {
	public static void main(String[] args) {
		int dividend = 100;
		int divisor = 0;
		try {
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
		} catch(ArithmeticException e) {	// java.lang.ArithmeticException: / by zero
		System.out.println("0으로 나눌 수 없습니다.\n");
		}
		
		String[] stringNum = {"23", "12", "998", "3.141592"};
		try {
			for(int i=0; i<stringNum.length;i++) {
				int j = Integer.parseInt(stringNum[i]);
				System.out.println("숫자로 변환된 값은 >> "+j);
			}
		} catch(NumberFormatException e) {	// java.lang.NumberFormatException: For input string: "3.141592"
			System.out.println("정수로 변환할 수 없습니다.\n");
		}
	}
}
