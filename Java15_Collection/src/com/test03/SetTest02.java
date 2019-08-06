package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.score.Score;

public class SetTest02 {

	public static void main(String[] args) {
		// iterator : collection Set<E>요소를 읽어오는 표준화된 방법
		
		Set<Score> scoreSet = new HashSet<Score>();
		
		scoreSet.add(new Score("홍길동",90,60,71));
		scoreSet.add(new Score("김선달",70,58,75));
		scoreSet.add(new Score("이순신",90,61,76));
		
		//prn(scoreSet);
		transElem(scoreSet, "이순신", 100);
		// scoreSet 안에 들어 있는 Score 객체중 이름이 이순신인 객체를 찾아서 국어점수를 100점으로 바꾸고 전체출력
	}
	
	private static void transElem(Set<Score> scoreSet, String string, int i) {
		
		// 방법 1:
		/*for(Score s : scoreSet) {
			if(s.getName().equals(string)) {
				s.setKor(i);				
			}
		}
		prn(scoreSet);*/
		
		// 방법 2:
		Object[] o = scoreSet.toArray();
		for(int j = 0; j < o.length; j++) {
			if(((Score)o[j]).getName().equals(string)){
				((Score)o[j]).setKor(i);
				break;
			}
			
		}
		prn(scoreSet);
		
		/*Iterator<Score> ir = scoreSet.iterator();
		while(ir.hasNext()) {
			Score tmp = ir.next();	// next가 홍길동의 kor을 갖고 있기 때문에 tmp를 하나 만들어준다.
			if(tmp.getName().equals(string)) {
				tmp.setKor(i);
			}
		}
		prn(scoreSet);*/
	}

	public static void prn(Set<Score> set) {
		
		// 방법 1:
		/*for(Score s : set) {
			System.out.println(s);
		}*/
		
		// 방법 2:
		/*Object[] oArr = set.toArray();			// upCasting(Score->Object), 묵시적 형 변환
		for(int i = 0; i < oArr.length; i++) {
			//System.out.println(oArr[i]);
			System.out.println(((Score) oArr[i]).getName());
									// downCasting(Object->Score), 명시적 형 ㅂㄴ환
		
		}*/
		
		// 방법 3:
		Iterator<Score> ir = set.iterator();
		while(ir.hasNext()) {	// 커서를 이용하여 hasNext, 다음 것에 값이 있는지를 확인함
								// Iterator : Collection에 있는 값 불러오기
			System.out.println(ir.next());	// next : 값을 밖으로 내보내줌.
		}
		
	}
	
}


