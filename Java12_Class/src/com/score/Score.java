package com.score;

/*
 * getSum() : kor eng math 총 합 리턴
 * getAvg() : 총 합 / 3 해서 평균 리턴
 * getGrade() :
 * 90 ~ 100 : "A"
 * 80 ~ 89 : "B"
 * 70 ~ 79 : "C"
 * 60 ~ 69 : "D"
 * ~59 : "F" 리턴
 */
public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math) {
		// this. 를 여기서 선언해줘도 가능
	}
	
	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
		
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
		
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
		
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		int sum = kor+eng+math;
	
		return sum;
	}
	public double getAvg() {
		int avg = (kor+eng+math)/3;
		//int avg = getSum()/3;
		return avg;
	}
	public String getGrade() {
		String grade ="";
		switch((kor+eng+math)/30) {
		case 10: case 9: grade = "A";
		break;
		case 8: grade = "B";
		break;
		case 7: grade = "C";
		break;
		case 6: grade = "D";
		break;
		default: grade = "F";
		break;
		
		/*
		 * switch((int)getAvg()/10){
		 * case10: case9: return "A"; ...
		 */
		
		}
	
		return grade;
	}
	@Override
	public String toString() {	//toString : 해시코드를 가져와서 16진수로
		return "이름 : " +name + " 국어 : "+kor+" 영어 : "+eng+" 수학 : "+math+" 총점 : "+getSum()+" 평균 : "+getAvg()+" 등급 : "+getGrade();
		
	}

}








