package com.compare;

public class Score implements Comparable<Object>{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 기본 생성자
	public Score() {
		
	}
	// 파라미터 4개짜리 생성자
	public Score(String name, int kor, int eng, int math) {		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//getter setter
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
	//getSum()-return int , getAvg() - double, getGrade() - String
	public int getSum() {
		//int sum = kor+eng+math;
		//return sum;
		return kor+eng+math;
	}

	public double getAvg() {
		double avg = getSum()/3;
		return getSum()/3;
	}

	public String getGrade() {
		String grade ="";
		/*switch(getSum()/30) {		//switch((int)getAvg()/10)
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
		}*/
		if(getSum()/3 >=90) {
			grade = "A";
		}else if(getSum()/3<90&&getSum()/3>=80) {
			grade = "B";
		}else if(getSum()/3<80&&getSum()/3>=70) {
			grade = "C";
		}else if(getSum()/3<70&&getSum()/3>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
	//toString
	public String toString() {
		/*return "이름 : " +name + " 국어 : "+kor+" 영어 : "+eng+" 수학 : "+math+
				" 총점 : "+getSum()+" 평균 : "+getAvg()+" 등급 : "+getGrade();*/
		return String.format("이름 : %s\t\t국어 : %d점\t영어 : %d점\t수학 : %d점\n총점 : %d점\t평균 : %.2f점\t등급 : %s\n", 
				name, kor, eng, math, getSum(), getAvg(), getGrade());
	}
	
	//작은것부터 차례대로 정렬
	@Override
	public int compareTo(Object o) {
		Score other = (Score)o;
		
		// 1이면 앞의 인자가 더 큰 값
		// 0이면 같은 값
		// -1이면 뒤의 인자가 더 큰 값
		
		if(this.getKor() > other.getKor()) {
			return 1;
		}
		else if(this.getKor() == other.getKor()) {
			
				return 1;
			
			}
		
		return 0;
	}
}




