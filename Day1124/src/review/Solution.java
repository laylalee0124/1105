package review;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] solution (int[] numbers) {
		
		
		//int[] answer = {};						// 배열 대신 (갯수제한 o)
		Set<Integer> set=new HashSet<Integer>();	// collection 사용해보기 (갯수제한 x), integer type만 모인 collection 집합. 중복 허용x
		int[] answer = {};	
		
		for(int i=0; i<numbers.length-1; i++) {
			int key=numbers[i]; // i=0
			for(int j=i+1; j<numbers.length; j++) {
				int result=key+numbers[j]; // j=1
				set.add(result);
			}
			
		}
		
		//출력
		for( Integer n : set) {
			System.out.print(n + " ");
		}
		
		return answer;
		
	}
}


