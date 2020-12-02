package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {
	public static void main(String[] args) {

		
//========================Set list =====================
		Set<Integer> set=new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);	// 데이터 중복저장불가
		set.add(30);	// 데이터 중복저장불가
		
		System.out.println(set.size());
		
		// set.get();	// 배열순서를 기억하지않기 때문에 index#가없어서 get을 쓸 수 없음.
		// 대신, Iterator()를 사용함.
		for (Integer z : set) {
			System.out.println(z);
		}
		
		Iterator<Integer> itr=set.iterator();
		
		System.out.println("============");
		while(itr.hasNext()) {  // 데이터가 있는지를 판단 : true를 반환함 if the iteration has more elements
			System.out.println(itr.next());		//itr.next() :  Returns the next element in the iteration.
		}
		
		
		
	}
}
