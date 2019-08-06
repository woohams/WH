package com.score;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {	//alt + shift + s 후 아래서 2번째
		
	}

	public Score(String name, int kor, int eng, int math) {	//alt + shift + s 후 아래서 3번째
		super();											//Source에서도 사용 가능
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {	//alt + shift + s 후 Generate Getters and Setters
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
		return kor+eng+math;
	}
	public double getAvg() {
		return getSum()/3;
	}
	public String getGrage() {
		String res = "";
		switch((int)getAvg()/10) {
		case 10: case 9: res="A"; break;
		case 8: res="B"; break;
		case 7: res="C"; break;
		case 6: res="D"; break;
		default: res="F"; break;
		}		
		return res;
	}

	@Override
	public String toString() {	// alt + shift + s -> Generate toString
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", getSum()=" + getSum()
				+ ", getAvg()=" + getAvg() + ", getGrage()=" + getGrage() + "]";
	}
	
}
