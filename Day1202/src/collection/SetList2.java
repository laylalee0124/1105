package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetList2 {
	public static void main(String[] args) {

		
		// LinkedHashSet은 중복저장은 x & 순서 기억 o
		Set<Integer> set=new LinkedHashSet<>();
		
		set.add(107);
		set.add(205);
		set.add(304);
		set.add(805);
		set.add(325);
		
		System.out.println(set.size());
		
		for (Integer n : set) {
			System.out.println(n);
		}
		
		
	}
}
