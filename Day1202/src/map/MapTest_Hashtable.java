package map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapTest_Hashtable {
	public static void main(String[] args) {
		
		// Map<key, value> data type을 generic으로 정의.
		Map<Integer, String> map=new Hashtable<>();
		
		//map.put(key, value)
		map.put(1, "AAA");	// 1(key)에 삽입
		map.put(1, "BBB");	// 1(key)에 replace
		map.put(2, "하하1");
		map.put(2, "하하2");
		map.put(2, "하하3");
		map.put(3, "홀ㄹ로");
		map.put(3, "호롤로");
		map.remove(2);		// 2(key)를 삭제
		
		System.out.println(map.size());
		System.out.println(map.get(1));
		
		// 출력하는 방법.
		System.out.println("==========");
		Set<Integer> keys=map.keySet();	// key 값만 set계열로 변환.
		for (Integer key : keys) {
			System.out.println(map.get(key));
		}
		
		
		

		
	}
}
