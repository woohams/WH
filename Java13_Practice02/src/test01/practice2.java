package test01;

public class practice2 {

	public static void main(String[] args) {
		
		char c = '예';
		String s = "아니요";	// case 문에는 정수형/문자열만 가능.
		
		switch(s) {
		case "예": System.out.println("배고픕니다.");
		break;
		case "아니요" : System.out.println("아닙니다.");
		break;
		default : System.out.println("예 / 아니요 로만 답해주세요.");
		}
	}

}
