package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_HashMap {
	public static void main(String[] args) {
		
		// Map<key, value> data type을 generic으로 정의.
		Map<String, String> map=new HashMap<>();
		
		map.put("이름", "우하하");
		map.put("전화", "45406706504");
		map.put("나이", "80");
		
		Set<String> keys=map.keySet();
		
		System.out.println(map.size());
		System.out.println(map.get("이름"));
		System.out.println("=====");
		
		for (String key : keys) {
			System.out.println(key+" : "+map.get(key));	// key값 + key의 value값
		}

		
	}
}
