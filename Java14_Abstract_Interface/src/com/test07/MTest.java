package com.test07;

public class MTest {
	public static void main(String[] args) {
		
		MyProfile my = new MyProfile("홍길동", "010-1234-5678");
		my.jobLoc("서울시 강남구");
		my.display();
	}

}






/* profile 클래스에 public Profile(String name, String phone)
 *  이름+name->홍길동 , 전화번호+phone -> "010-1234-5678"
 *  
 *  MyProfile에서 display를 재정의(오버라이드)하여 super.getProfile()을 가져왔고 (이름과 전화번호)
 *  이후에 회사주소+loc, 회사직종+JOB_ID를 추가하여 MTest에서 jobLoc에"서울시 강남구"를 초기화시키고
 *  my.display를 호출한다.
 *  
 *  프로필 클래스의 겟프로필 메소드(여기서 이름과 전화번호가 써져있음)를 가져와 마이프로필에서 재정의시킨다(이름,전화번호에 회사주소, 회사직종)
 *  MTest에서 Profile을 상속받은 MyProfile에 홍길동과 010~을 저장
 *  Override한 jobLoc에 "서울시 강남구" 저장
 *  Override한 display 불러오기(display super.getProfile()에 이름과 전화번호가 들어있고 회사주소는 MTest에서 값을 저장시켜주었고
 *  JOB_ID("it 관련")은 JOB에서 기본선언해놨다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */






