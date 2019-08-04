package com.score;

public class MTest {

	public static void main(String[] args) {
		// 1. Score 객체를 만들고 setter를 이용하여 짝궁의 이름, 국어, 영어, 수학 점수를 초기화 하자.
		Score s = new Score();
		s.setName("하준성");
		s.setKor(56);
		s.setEng(63);
		s.setMath(79);
		
		// 2. Score 객체를 만들고 생성자를 이용하여 내 이름, 국어, 영어, 수학 점수를 초기화 하자.
		Score s1 = new Score();
		s1.setName("진우현");
		s1.setKor(91);
		s1.setEng(71);
		s1.setMath(83);
		
		// 3. 짝궁과 내 모든 정보를 출력하자.
		System.out.printf("%s님의 국어점수는 %d점, 영어점수는 %d점, 수학점수는 %d점입니다. 점수의 총 합은 %d점이며 평균은 %.2f입니다. 학점은 %s입니다."
				, s.getName(), s.getKor(),s.getEng(), s.getMath(),s.getSum(),s.getAvg(),s.getGrade());
		System.out.printf("\n%s님의 국어점수는 %d점, 영어점수는 %d점, 수학점수는 %d점입니다. 점수의 총 합은 %d점이며 평균은 %.2f입니다. 학점은 %s입니다"
				, s1.getName(), s1.getKor(),s1.getEng(), s1.getMath(),s1.getSum(),s1.getAvg(),s1.getGrade());
		System.out.println(s);
		System.out.println(s1);
	}

}
