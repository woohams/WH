package com.test04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//Map<key, key> : 순서 x, key는 중복 x, value는 중복 o
public class MapTest {
	
	// Map<key, value>
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 111; i <116; i++) {
			map.put(i,  i+"abc ");
		}
		
		map.put(111, "abcabc");	// key = 중복 x
		map.put(116, "abcabc");	// value = 중복 o
		
		System.out.println(map);
		
		prn(map);
	}
	
	public static void prn(Map<Integer,String> map) {
		
		System.out.println(map.get(111));	// key 값을 가지고 value 값을 출력

		Set<Map.Entry<Integer,String>> entry = map.entrySet();
		// Map<> : key, value를 통째로 관리(한번에 관리), key 값을 통해 value 값에 접근
		// Map.Entry<> : key, value를 각각 관리(getKey(), getValue())
		
		// entrySet() 메소드를 통해 Set<Map.Entry<Integer, String>>을 리턴
		// entry를 set으로 관리하겠다.
		// set 안에 있는 entry를 각각 가져와서 entry 안에 있는 key와 value를 각각 사용.
		
		for(Entry<Integer, String> en : entry) {
			System.out.printf("%d : %s",en.getKey(),en.getValue());
			System.out.println();
				
		}
	}

}


